

package zwiemandl.src.factory;

public class GoldAccount extends AccountBase implements AccountI {
     
    @Override
    public int addRewardPoints (double amount) {
        rewardPoints += (int)Math.round(amount/goldTAValue) ;  
        return rewardPoints ;
    }   
}
