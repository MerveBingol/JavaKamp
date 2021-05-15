package Concrete;

import Abstract.UserValidationService;
import Entities.Gamer;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		if(gamer.getYearOfBirth()==2000 && gamer.getFirstName()=="Merve"
				&& gamer.getLastName()=="BÝNGÖL" && gamer.getNationalityId()=="123456" ) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
