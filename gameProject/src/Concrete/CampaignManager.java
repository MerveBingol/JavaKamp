package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.GameSale;

public class CampaignManager implements CampaignService {

	@Override
	public boolean newCampaignEntry(GameSale gameSale) {
	   if(gameSale.getGamePrice()>=100) {
		   System.out.println("Kampanya eklendi");
		   return true;
	   }
	   else {
		   	return false;
	   }
	}
	
	

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("Kampanya silindi");
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Kampanya güncellendi");
		
	}

}
