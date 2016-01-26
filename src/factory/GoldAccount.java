

package zwiemandl.src.factory;

public class GoldAccount extends AccountBase implements AccountI {
    
    //private int rewardPoints ;
        
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/goldTAValue) ;  
        return rewardPoints ;
    }   
}
