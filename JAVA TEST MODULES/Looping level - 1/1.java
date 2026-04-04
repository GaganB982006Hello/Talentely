'''1.Count the number of prime numbers less than a non-negative number n.'''

class CountPrimesSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));
        sc.close();
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
