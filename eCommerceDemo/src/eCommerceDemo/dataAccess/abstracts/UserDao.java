package eCommerceDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	

    void add(User user);
	
	void delete(User user);
	
	void update(User user);
	
	User getById(int id);
	
	User getByMail(String email);
	
	User getByMailAndPassword(String email,String password);
	
	List<User>getAll();

}
