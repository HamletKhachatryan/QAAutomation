public class DiagTwoDArray {

    public static void main(String[] args) {

        int[][] TwoDArray = new int[8][8];
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int j = 0; j < TwoDArray[0].length; j++) {
                if (TwoDArray[j] == TwoDArray[i]) {
                    TwoDArray[i][j] = 1;
                }
            }

            for (int j1 = TwoDArray[0].length - 1; j1 >= 0; j1--) {
                if (TwoDArray[j1] == TwoDArray[TwoDArray.length - 1 - i]) {
                    TwoDArray[i][j1] = 1;

                }
                System.out.print(" " + TwoDArray[i][j1] + " ");
            }
            System.out.println();
        }

    }
}
