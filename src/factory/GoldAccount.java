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
public class GoldAccount implements AccountI {
    
    private final int goldTAValue = 8 ;
    private int rewardPoints ;
    
    @Override
    public int rewardPoints (double amount) {
        rewardPoints = (int)Math.round(amount/goldTAValue) ;  
        return rewardPoints ;
    }   
}
