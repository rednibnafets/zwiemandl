

package zwiemandl.src.factory;

public class GoldAccount implements AccountI {
    
    private final int goldTAValue = 8 ;
    private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/goldTAValue) ;  
        return rewardPoints ;
    }   
}
