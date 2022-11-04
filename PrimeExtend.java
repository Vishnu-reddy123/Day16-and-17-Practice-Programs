public class PrimeExtend {

    public static void main(String[] args) {
        int num, temp, val, rev;
        System.out.println("Below are the prime prime numbers that are Anagram and Palindrome between 0 to 1000");
        for (num = 0; num <= 1000; num++) {
            val = 0;
            rev = 0;
            temp = num;
            for (int i = 1; i <= temp; i++) {
                if (temp % i == 0)
                    val++;
            }
            if (val == 2) {
                while (temp > 0) {
                    rev = rev * 10 + (temp % 10);
                    temp /= 10;
                }
                if (rev == num)
                    System.out.print(num + " ");
            }
        }
    }
}