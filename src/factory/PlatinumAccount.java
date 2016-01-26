/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zwiemandl.src.factory;

/**
 *
 * @author stefan
 */
public class PlatinumAccount implements AccountI {
    
    private final int platinumTAValue = 4 ;
    private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/platinumTAValue) ;  
        return rewardPoints ;
    }         
    
}
