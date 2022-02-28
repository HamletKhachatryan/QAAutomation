public class DynamicArray {
    public static void main(String[] args) {
        int[] x;
        x = removeElement(13, 1);


    }

    public static int[] removeElement(int nums, int val) {
        int[] numbs = {9, 201, 6, 4, 8, 7, 3, -500, 2, 11, 5, 10, 1};
        int offset = 0;

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] == val) {
                offset++;
            } else {
                numbs[i - offset] = numbs[i];

                System.out.print(numbs[i] + ",");
            }
        }
        return null;
    }

}

