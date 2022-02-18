public class Faktorial {
    public static void main(String[] args) {
        int n = 0;
        System.out.print(fakt(-1));
    }
    public static int fakt(int n) {
        if (n < 0) {
            System.out.print("There is no factorial of a negative number: ");
            return n;
        }
        if(n==0||n==1){
            System.out.print("The factorial of the number " + n + " is equal: ");
            return 1;
        }
        int fakt = 1;
        for (int i = 2; i <= n; i++) {
            fakt *= i;

        }
        System.out.print("The factorial of the number " + n + " is equal:");
        return fakt;
    }

}
