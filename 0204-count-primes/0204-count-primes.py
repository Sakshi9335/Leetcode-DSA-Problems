class Solution:
    def countPrimes(self, n: int) -> int:
        if n <= 2:
            return 0
        isPrime = [True] * n
        count = 0

        for i in range(2, n):
            if isPrime[i]:
                count += 1
                if i * i < n:
                    for j in range(i * i, n, i):
                        isPrime[j] = False

        return count
