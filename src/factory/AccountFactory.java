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
public class AccountFactory {
    public static AccountI createAccount (String actype) {
        if (actype.equalsIgnoreCase("Silver")){
              return new SilverAccount();
        }else if(actype. equalsIgnoreCase ("Gold")){
              return new GoldAccount();
        }else if(actype. equalsIgnoreCase ("Platinum")){
              return new PlatinumAccount();
        }
        throw new IllegalArgumentException("Cannot create a ' " + actype + " ' account!" );
    }    
}
