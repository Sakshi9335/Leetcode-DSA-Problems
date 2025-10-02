class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty=numBottles;
        int count=numBottles;
        while(numExchange<=empty)
        {
            empty=empty-numExchange+1;
            count++;
            numExchange++;
        }

        return count;
    }
}