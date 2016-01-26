

package zwiemandl.src.factory;

public class SilverAccount extends AccountBase {
    
    //private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/silverTAValue) ;  
        return rewardPoints ;
    }       
   
}
