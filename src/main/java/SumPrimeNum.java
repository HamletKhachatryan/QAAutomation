public class SumPrimeNum {
    public static void main(String args[]) {
        int[] primeNumbers = new int[100];
        int i, j, k;
        int sumArrNum = 0;
        for (i = 0; i < primeNumbers.length; i++) {
            for (j = i + 1; j <= i + 1; j++) {
                primeNumbers[i] = j;
                sumArrNum += primeNumbers[i];
            }
        }
        System.out.println("sumArrNum = " + sumArrNum + ":");
        System.out.print("primeNum= ");
        boolean b = true;
        for (k = 1; k < primeNumbers.length; k++) {
            for (int i1 = 2; i1 < k; i1++) {
                if (primeNumbers[k] % i1 == 0) {
                    b = false;
                    break;
                }
            }

            if (b) System.out.print(primeNumbers[k] + ",");
            else b = true;
        }
        System.out.println("\b:");
    }
}