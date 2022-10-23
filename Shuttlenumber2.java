
public class Shuttlenumber2 {
    private static boolean ShutleeNums(int num) {
        int tmp = num % 10;
        do {
            if (tmp == 4 || tmp == 9)
                return false;
            num /= 10;
            tmp = num % 10;
        } while (num > 0);
        return true;
    }

    public static void main(String[] args) {
        int num = 1;
        int num1 = 1;
        while (num <= 100) {
            if (ShutleeNums(num1)) {
                System.out.println(num1);
                num++;
            }
            num1++;
        }

    }
}