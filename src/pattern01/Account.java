/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern01;

/**
 *
 * @author stefan
 */
public class Account {
    
    private String actype ;  // account type
    private double balance ;
    private int rewardPoints ;
    
    // transaction value per point
    private final int silverTACost = 15 ;
    private final int goldTACost = 8 ;
    private final int platinumTACost = 4 ;
    
    // balance costs
    private final int goldBCost = 1500 ;
    private final int platinumBCost = 750 ;
    
    
    
    public Account(String actype){
        this.actype = actype ;
        this.balance = 0.0 ;
        this.rewardPoints = 0 ;
    }
    
    
    public int rewardPoints(double amount){
    
        //int points = 0 ;
        switch(actype)
        {
            case "silver":                
                rewardPoints = (int)Math.round(amount/silverTACost) ;
                break;
            case "gold":                
                rewardPoints = (int)Math.round(amount/goldTACost) ;
                break;
            case "platinum":                
                rewardPoints = (int)Math.round(amount/platinumTACost) ;
                break;                
            default:
                break;
        }
        return this.rewardPoints;
        
    }
    
    public int getRewardPoints(){ return this.rewardPoints; }
        
        
        
        
        
        
        
        
    
    
}
