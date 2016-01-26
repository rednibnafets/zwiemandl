package zwiemandl.src.factory;

public class SilverAccount extends AccountBase {
// implied ...    
//    public SilverAccount() {
//        super();
//    }

    @Override
    public int addRewardPoints(double amount) {
        rewardPoints += (int) Math.round(amount / silverTAValue);
        return rewardPoints;
    }

}
