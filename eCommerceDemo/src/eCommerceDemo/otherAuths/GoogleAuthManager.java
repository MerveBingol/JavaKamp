package eCommerceDemo.otherAuths;

import eCommerceDemo.business.abstracts.ForAllService;

public class GoogleAuthManager implements ForAllService {

	@Override
	public void register(int id, String firstName, String lastName, String eMail, String passsword) {
		System.out.println("Google ile kayýt olundu");
		
	}

	@Override
	public void logIn(String eMail, String password) {
		System.out.println("Google ile giriþ yapýldý");
	}

}
