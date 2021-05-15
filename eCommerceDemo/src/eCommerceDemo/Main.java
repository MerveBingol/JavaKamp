package eCommerceDemo;

import eCommerceDemo.business.abstracts.ForAllService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.AuthManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.concretes.UserValidationManager;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.otherAuths.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new HibernateUserDao());
		
		ForAllService allService=new AuthManager(userService,new UserValidationManager());
		
		allService.register(1,"Merve" ,"Bingöl", "merve@gmail.com", "123456");
		
		allService.register(2,"Nurcan" ,"Aksu", "merve@gmail.com", "123456");// Bu e mail ile baþka bir üye mevcut
		
		
		allService.logIn("merve@gmail.com", "123456");
		
		System.out.println("----------------------------------------------------------");
		
		GoogleAuthManager googleAuthManager=new GoogleAuthManager();
		googleAuthManager.register(1,"Merve" ,"Bingöl", "merve@gmail.com", "123456");
		googleAuthManager.logIn("merve@gmail.com", "123456");
		
		
	
		
		
		
		
	 
	}

}
