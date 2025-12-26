class Solution {
    public int bestClosingTime(String customers) {
        int s= customers.length();
        int totalY = 0;
        for (char ch : customers.toCharArray()) {
            if (ch == 'Y')
             totalY++;
        }

        int openPenalty = 0;
        int closePenalty = totalY;
        int minPenalty = closePenalty;
        int bestHour = 0;

        for (int i = 0; i < s; i++) {
            if (customers.charAt(i) == 'Y') 
            {
                closePenalty--;
            } 
            else {
                openPenalty++;
            }

            if (openPenalty + closePenalty < minPenalty)
             {
                minPenalty = openPenalty + closePenalty;
                bestHour = i + 1;
            }
        }

        return bestHour;
    }
}