public class SortMaxMinArr {
    public static void main(String[] args) {

        int[] array = {10, 9, 6, 4, 8, 7, 3, 1, 2, 11, -100, 5, 201};
        int temp;
        int maxArr = array[0];
        int minArr = array[0];
        for (int k = 1; k < array.length; k++) {
            if (array[k]>maxArr) {
                maxArr = array[k];
            }
        }
        System.out.println("maxArr = " + maxArr);
        for (int k1 = 1; k1 < array.length; k1++) {
            if (array[k1]<minArr) {
                minArr = array[k1];
            }
        }
        System.out.println("minArr = " + minArr);
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("sortArray = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }


    }
}