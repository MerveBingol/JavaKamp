package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.ForAllService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.UserValidationService;
import eCommerceDemo.entities.concretes.User;

public class AuthManager implements ForAllService{

	UserService userService;
	UserValidationService userValidationService;
	

	public AuthManager() {

	}

	public AuthManager(UserService userService, UserValidationService userValidationService) {
		this.userService = userService;
		this.userValidationService = userValidationService;
		
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User userToRegister = new User(id, firstName, lastName, email, password);

		if (!this.userValidationService.userRegisterValidate(userToRegister)) {
			System.out.println("Kullan�c� bilgilerinizi kontrol ediniz!");
			return;
		}

		if (!checkIfUserExists(email)) {
			System.out.println("Kay�t olma i�lemi ba�ars�z. Bu email ile bir ba�ka �ye mevcut.");
			return;
		}

		

		userService.add(userToRegister);
	}

	@Override
	public void logIn(String email, String password) {

		if (!this.userValidationService.logInValidate(email, password)) {
			System.out.println("Kullan�c� bilgilerinizi kontrol ediniz!");
			return;
		}

		User userToLogin = userService.getByMailAndPassword(email, password);

		if (userToLogin == null) {
			System.out.println("Giri� ba�ar�s�z. E-Posta veya �ifre hatal�d�r.");
			return;
		}
		
		

		System.out.println("Giri� ba�ar�l�  Ho�geldin " + userToLogin.getFirstName() + " " + userToLogin.getLastName());

	}

	private boolean checkIfUserExists(String email) {
		return this.userService.getByMail(email) == null;
	}
}



