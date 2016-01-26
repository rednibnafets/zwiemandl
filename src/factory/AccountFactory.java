
package zwiemandl.src.factory;

public class AccountFactory {
    public static AccountI createAccount (String actype) {
        if  (actype.equalsIgnoreCase("Silver")){
              return new SilverAccount();
        }else if(actype. equalsIgnoreCase ("Gold")){
              return new GoldAccount();
        }else if(actype. equalsIgnoreCase ("Platinum")){
              return new PlatinumAccount();
        }
        throw new IllegalArgumentException("Cannot create a ' " + actype + " ' account!" );
    }    
}
