package zwiemandl.src.factory;

public class PlatinumAccount extends AccountBase{
// being explicit here ..    
    public PlatinumAccount() {
        super();
    }

    @Override
    public int addRewardPoints(double amount) {
        rewardPoints += (int) Math.round(amount / platinumTAValue);
        return rewardPoints;
    }
 
// same method used in all subclasses -> see class AccountBase
//    @Override
//    public int getRewardPoints() {
//        return rewardPoints;
//    }      

}
