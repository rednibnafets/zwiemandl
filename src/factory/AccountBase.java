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
public abstract class AccountBase implements AccountI {

    protected double balance;
    protected int rewardPoints;

    public AccountBase() {
        this.balance = 0.0;
        this.rewardPoints = 0;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
}
