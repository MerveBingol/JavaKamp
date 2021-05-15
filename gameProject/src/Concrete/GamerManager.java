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
			System.out.println(gamer.getFirstName()+" adlý oyuncu kayýt oldu");
		}
		else {
			System.out.println("Doðrulama baþarýsýz,Kayýt olunamadý ");
		}
		
	}

	@Override
	public void gamerDelete(Gamer gamer) {
		System.out.println( gamer.getFirstName()+ " Adlý oyuncu silindi");
		
	}

	@Override
	public void gamerUpdate(Gamer gamer) {
		System.out.println( gamer.getFirstName()+ " Adlý oyuncu güncellendi");
		
	}

}
