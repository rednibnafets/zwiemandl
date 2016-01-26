

package zwiemandl.src.factory;

public class SilverAccount implements AccountI {
    
    private final int silverTAValue = 15 ;
    private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/silverTAValue) ;  
        return rewardPoints ;
    }       
   
}
