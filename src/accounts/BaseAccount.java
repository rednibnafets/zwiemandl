/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zwiemandl.src.accounts;

/**
 * base classs / parent / super
 * see also
 * http://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
 * @author stefan
 */
public class BaseAccount {
    
    protected double balance ;
    protected int rewardPoints ;
    
    public BaseAccount(){
        this.balance = 0.0 ;
        this.rewardPoints = 0 ;
    }  
    
    public int getRewardPoints() { return rewardPoints; }
}

/*
* A subclass inherits all of the public and protected members of its parent, 
* no matter what package the subclass is in. If the subclass is in the same 
* package as its parent, it also inherits the package-private members of 
* the parent. 
*/

// use protected
// http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
