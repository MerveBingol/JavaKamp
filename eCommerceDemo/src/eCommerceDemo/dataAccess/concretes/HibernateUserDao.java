package eCommerceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User>users=new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibernate ile kayýt oldu : "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi ");
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi ");
		
	}

	@Override
	public User getById(int id) {
		for(User user: users) {
			if(user.getId()==id)
				return user;
		}
		return null;
	}

	@Override
	public User getByMail(String email) {
		for(User user: users) {
			if(user.geteMail()==email)
				return user;
		}
		return null;
	}
	

	@Override
	public User getByMailAndPassword(String email, String password) {
		for(User user: users) {
			if(user.geteMail()==email && user.getPassword()==password)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	


}
