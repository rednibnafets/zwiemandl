/*
 * refactoring: Factory pattern
 */
package zwiemandl.src.pattern01;

import zwiemandl.src.accounts.SilverAccount;
import zwiemandl.src.accounts.PlatinumAccount;
import zwiemandl.src.accounts.GoldAccount;

// we only need to import the interface and AccountFactory
import zwiemandl.src.factory.AccountFactory;
import zwiemandl.src.factory.AccountI;

/**
 * Design Patterns: Factory
 *
 * @author stefan
 */
public class Pattern01 {

    public static void main(String[] args) {

        // one class, client uses new
        oneClass();
        System.out.println("--------------------------------------");
        // use superclass and subclasses, client uses new
        superAndSubClasses();
        System.out.println("--------------------------------------");
        // use the Factory pattern -> do not allow the client to use new

        try {

            AccountI silver = AccountFactory.createAccount("Silver");
            System.out.println(silver.rewardPoints(123.00));

            AccountI thegolden = AccountFactory.createAccount("GOLD");
            System.out.println(thegolden.rewardPoints(123.00));

            AccountI anotherPlatinum = AccountFactory.createAccount("pLATINUM");
            System.out.println(anotherPlatinum.rewardPoints(123.00));

            // makes the program crash if the exception is not handled
            AccountI bogusAccount = AccountFactory.createAccount("I throw an exception");

        } catch (IllegalArgumentException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
        
        System.out.println("------- end of program --------") ;
    }

    public static void oneClass() {
        Account ac01 = new Account("silver");
        ac01.rewardPoints(123.00);
        System.out.println(ac01.getRewardPoints());

        Account ac02 = new Account("gold");
        ac02.rewardPoints(123.00);
        System.out.println(ac02.getRewardPoints());

        Account ac03 = new Account("platinum");
        ac03.rewardPoints(123.00);
        System.out.println(ac03.getRewardPoints());
    }

    public static void superAndSubClasses() {

        SilverAccount ac001 = new SilverAccount();
        ac001.rewardPoints(123.00);
        System.out.println(ac001.getRewardPoints());

        GoldAccount ac002 = new GoldAccount();
        ac002.rewardPoints(123.00);
        System.out.println(ac002.getRewardPoints());

        PlatinumAccount ac003 = new PlatinumAccount();
        ac003.rewardPoints(123.00);
        System.out.println(ac003.getRewardPoints());

        // if this is possible, use protected
        //System.out.println(ac003.balance) ;   
    }

}
