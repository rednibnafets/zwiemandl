/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zwiemandl.src.accounts;

/**
 *
 * @author stefan
 */
public class SilverAccount extends BaseAccount{
    
    private final int silverTACost = 15 ;
    
    public SilverAccount ()
    {
        super() ;   // call the base class's ctor
    }
    
    public int rewardPoints(double amount){
                  
        rewardPoints = (int)Math.round(amount/silverTACost) ;  
        return rewardPoints ;
        
    }
   
}
