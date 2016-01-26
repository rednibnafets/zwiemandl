/*
 * refactoring: Factory pattern
 */
package pattern01;

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
        
    }
    
}
