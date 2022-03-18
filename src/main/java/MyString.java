class MyString {
    private char[] arr;
    private int size;

    MyString() {
        this.size = 0;
    }

    MyString(char[] arr) {
        this.arr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
        this.size = arr.length;
    }

    MyString(MyString str) {
        this.arr = new char[str.arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = str.arr[i];
        }
        this.size = arr.length;
    }

    void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public char myCharAt(int index) {
        if (this.size == 0 || index < 0 || index >= arr.length) {
            System.out.print("index out of range");
            return ' ';
        }
        return arr[index];

    }

    public int myCompareTo(MyString other) {
        if (other.size == this.size) {
            int sumThis = 0;
            int sumOther = 0;
            for (int i = 0; i < other.size; i++) {
                sumOther += other.myCharAt(i);
            }
            for (int i = 0; i < this.size; i++) {
                sumThis += this.arr[i];
            }
            return (sumThis - sumOther);
        }
        return (this.size - other.size);
    }

    public int myCompareToIgnoreCase(MyString other) {
        if (other.size == this.size) {
            int sumThis = 0;
            int sumOther = 0;
            for (int i = 0; i < other.size; i++) {
                sumOther += other.myCharAt(i);
                if (other.myCharAt(i) > 96 && other.myCharAt(i) < 123) {
                    sumOther -= 32;
                }
            }
            for (int i = 0; i < this.size; i++) {
                sumThis += this.arr[i];
                if (this.arr[i] > 96 && this.arr[i] < 123) {
                    sumThis -= 32;
                }
            }
            return (sumThis - sumOther);
        }
        return (this.size - other.size);
    }

    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'A', 'b', 'c'};
        MyString myString = new MyString(arr1);
        MyString myString1 = new MyString(myString);
        MyString myString2 = new MyString(arr2);
        myString.show();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (char) i;
        }
        //  myString.myCharAt(2);
        System.out.println(myString2.myCharAt(3));
        System.out.println(myString.myCompareTo(myString2));
        System.out.println(myString.myCompareToIgnoreCase(myString2));

    }
}