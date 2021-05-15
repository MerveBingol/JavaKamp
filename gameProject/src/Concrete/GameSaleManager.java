package Concrete;

import Abstract.CampaignService;
import Abstract.GameSaleService;
import Entities.GameSale;
import Entities.Gamer;

public class GameSaleManager implements GameSaleService {

	CampaignService campaignService;
	
	
	public GameSaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}


	@Override
	public void sale(Gamer gamer,GameSale gameSale) {
		System.out.println(gamer.getFirstName()+" adlý oyuncu oyun satýn aldý");
		
	}

}
