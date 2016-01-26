

package zwiemandl.src.factory;
// Interfaces: all fields are automatically public, static, and final
public interface AccountI {
    
    public static final int platinumTAValue = 4 ;  
    int goldTAValue = 8 ;
    int silverTAValue = 15 ;
     
    abstract int rewardPoints (double amount) ;  
    // is abstract by default -> keyword abstract not needed. 
}
//
// see also
// http://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
//
