class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int ans = numBottles;
        while(empty>=numExchange){
            int newBottles = empty/numExchange;
            ans += newBottles;
            empty = empty % numExchange + newBottles;
        }
        return ans ;
    }
}