package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	UserValidationService validationService;
	

	public GamerManager(UserValidationService validationService) {
		
		this.validationService = validationService;
	}

	@Override
	public void gamerAdd(Gamer gamer) {
		 
		if(validationService.validate(gamer)) {
			System.out.println(gamer.getFirstName()+" adl� oyuncu kay�t oldu");
		}
		else {
			System.out.println("Do�rulama ba�ar�s�z,Kay�t olunamad� ");
		}
		
	}

	@Override
	public void gamerDelete(Gamer gamer) {
		System.out.println( gamer.getFirstName()+ " Adl� oyuncu silindi");
		
	}

	@Override
	public void gamerUpdate(Gamer gamer) {
		System.out.println( gamer.getFirstName()+ " Adl� oyuncu g�ncellendi");
		
	}

}
