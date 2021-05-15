package eCommerceDemo.business.abstracts;

public interface ForAllService {
	
	void register(int id,String firstName,String lastName,String eMail,String passsword);
	
	void logIn(String eMail,String password);

}
