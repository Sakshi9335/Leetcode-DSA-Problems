class Bank {
long [] paisa;
    public Bank(long[] balance) {
        paisa = balance;
    }
    public boolean isValid(int k ){
        if ( k <= paisa.length){
            return true;
        }
       else 
            return false;
    }
    public boolean transfer(int account1, int account2, long money) {
    if (!isValid(account1) || !isValid(account2)){
        return false;
    }
        else {
            if(money <= paisa[account1 - 1] ){
             paisa [account1 - 1] = paisa[account1 - 1] - money;
                paisa [account2 - 1] = paisa[account2 - 1] + money;
       
        return true;
        }
        else 
                return false;
            }
        }
    
    
    public boolean deposit(int account, long money) {
        if (!isValid(account) ){
            return false;
        }
        paisa [account - 1] = paisa[account - 1] + money;
        return true;
        
    }
    
    public boolean withdraw(int account, long money) {
        if (!isValid(account) ){
            return false;
        }
        if( money <= paisa[account - 1]){
            paisa [account - 1] = paisa[account - 1] - money;
        return true;
        }
        else 
            return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */