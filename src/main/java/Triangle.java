public class Triangle {
    public int part1;
    public int part2;
    public int part3;

    public Triangle(int part1, int part2, int part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

    public boolean isTriangle() {
        if ((part1 < (part2 + part3)) && (part2 < (part1 + part3)) && (part3 < (part1 + part2))) {
            System.out.print("There is such a triangle" + ":");
            return true;
        } else {
            System.out.print("There is no such triangle" + ":");
            return false;
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 9, 12);
        boolean a = triangle.isTriangle();
        System.out.println(a + " ");

    }
}
