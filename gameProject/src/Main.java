
import Concrete.CampaignManager;
import Concrete.GameSaleManager;
import Concrete.GamerManager;
import Concrete.UserValidationManager;
import Entities.GameSale;
import Entities.Gamer;


public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager=new GamerManager(new UserValidationManager());
		Gamer gamer=new Gamer();
		gamer.setFirstName("Merve");
		gamer.setLastName("BÝNGÖL");
		gamer.setYearOfBirth(2000);
		gamer.setNationalityId("123456");
		
		gamerManager.gamerAdd(gamer);
		

		GameSaleManager gameSaleManager=new GameSaleManager(new CampaignManager());
		GameSale gameSale=new GameSale();
		gameSale.getGamePrice(100);
	    gameSaleManager.sale(gamer, gameSale);
	  
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.newCampaignEntry(gameSale);
		
			
		
	

}
}
