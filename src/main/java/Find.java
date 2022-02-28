public class Find {

    public static void main(String[] args) {
        findIndex();
        findIndexEnd();
    }

    public static int findIndex() {
        int i;
        int[] array = {9, 201, 6, 4, 8, 7, 3, -500, 2, 11, 5, 10, 1};

        for (i = 1; i < array.length; i++) {
            if (array[i] == 201) {
                System.out.println("Index of number is equal: " + i);
            }
        }
        return i;
    }

    public static int findIndexEnd() {
        int i;
        int[] array = {9, 201, 6, 4, 8, 7, 3, -500, 2, 11, 5, 10, 1};
        int n = array.length;
        int temp;


        for (int j = 0; j < n / 2; j++) {

            temp = array[n - j - 1];
            array[n - j - 1] = array[j];
            array[j] = temp;

        }
       for (i = array.length - 1; i >= 0; i--) {
            if (array[i] == 201) {
                System.out.println("Index of number from end is equal: " + i);
            }
        }
        return i;
    }
}