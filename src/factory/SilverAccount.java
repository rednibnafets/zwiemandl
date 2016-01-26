

package zwiemandl.src.factory;

public class SilverAccount implements AccountI {
    
    private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/silverTAValue) ;  
        return rewardPoints ;
    }       
   
}
