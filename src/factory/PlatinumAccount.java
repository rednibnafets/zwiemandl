

package zwiemandl.src.factory;

public class PlatinumAccount extends AccountBase {
    
    //private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/platinumTAValue) ;  
        return rewardPoints ;
    }         
    
}
