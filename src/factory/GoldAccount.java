

package zwiemandl.src.factory;

public class GoldAccount extends AccountBase{
// being explicit here ..    
    public GoldAccount() {
        super();
    }
    
    @Override
    public int addRewardPoints (double amount) {
        rewardPoints += (int)Math.round(amount/goldTAValue) ;  
        return rewardPoints ;
    }
// same method used in all subclasses -> see class AccountBase
//    @Override
//    public int getRewardPoints() {
//        return rewardPoints;
//    }     
    
}
