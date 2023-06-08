public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        
        return true;
    }
}
