

package zwiemandl.src.factory;

public class PlatinumAccount implements AccountI {
    
    private final int platinumTAValue = 4 ;
    private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/platinumTAValue) ;  
        return rewardPoints ;
    }         
    
}
