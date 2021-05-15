package eCommerceDemo.business.concretes;

import java.util.List;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {

	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);	
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("Kullanýcý baþarýyla silindi: "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		System.out.println("Kullanýcý baþarýyla güncellendi: "+user.getFirstName());
		
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
		
	}

	@Override
	public User getByMail(String email) {
		return userDao.getByMail(email);
		
	}

	@Override
	public User getByMailAndPassword(String email, String password) {
		return userDao.getByMailAndPassword(email, password);
		
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	
	

}
