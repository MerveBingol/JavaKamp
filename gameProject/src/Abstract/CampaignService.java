package Abstract;

import Entities.Campaign;
import Entities.GameSale;

public interface CampaignService {
	
	boolean newCampaignEntry(GameSale gameSale);
	
	void campaignDelete(Campaign campaign);
	
	void campaignUpdate(Campaign campaign);

}
