/*
 * refactoring: Factory pattern
 */
package pattern01;

import accounts.SilverAccount;
import accounts.PlatinumAccount;
import accounts.GoldAccount;

/**
 *
 * @author stefan
 */
public class Pattern01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account ac01 = new Account("silver") ;
        ac01.rewardPoints(123.00) ;
        System.out.println(ac01.getRewardPoints()) ;

        Account ac02 = new Account("gold") ;
        ac02.rewardPoints(123.00) ;
        System.out.println(ac02.getRewardPoints()) ;
        
        Account ac03 = new Account("platinum") ;
        ac03.rewardPoints(123.00) ;
        System.out.println(ac03.getRewardPoints()) ; 
        
        System.out.println("--------------------------------------");
        
        SilverAccount ac001 = new SilverAccount() ;
        ac001.rewardPoints(123.00) ;
        System.out.println(ac001.getRewardPoints()) ;     
        
        GoldAccount ac002 = new GoldAccount() ;
        ac002.rewardPoints(123.00) ;
        System.out.println(ac002.getRewardPoints()) ;     
        
        PlatinumAccount ac003 = new PlatinumAccount() ;
        ac003.rewardPoints(123.00) ;
        System.out.println(ac003.getRewardPoints()) ;    
        
        
        
    
    }
    
}
