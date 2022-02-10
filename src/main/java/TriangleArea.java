public class TriangleArea {

    public int basis;
    public int height;
    public int part1;
    public int part2;

    public TriangleArea(int basis, int height, int part1, int part2) {
        this.basis = basis;
        this.height = height;
        this.part1 = part1;
        this.part2 = part2;
    }

    public int trangArea() {
        int area = (basis * height) / 2;
        System.out.print("The area of the triangle is equal:  ");
        return area;
    }

    public int triangPerimetre() {
        int perimetre = (basis + part1 + part2);
        System.out.print("The perimetre of the triangle is equal:  ");
        return perimetre;
    }

    public static class Quadrate {

        //        public   int part;
//
//        public Quadrate ( int part){
//            this.part = part;
//        }
        public static int quadArea(int part) {
            int area = (part * part);
            System.out.print("The area of the quadrate is equal:  ");
            return area;
        }

        public static int quadPerimetre(int part) {
            int perimetre = (4 * part);
            System.out.print("The perimetre of the quadrate is equal:  ");
            return perimetre;
        }

    }

    public static void main(String[] args) {
        TriangleArea triangleArea = new TriangleArea(5, 4, 6, 8);
        //  Quadrate quadrate = new Quadrate(6);

        int q = Quadrate.quadArea(6);
        System.out.println(q + " m2");
        int d = Quadrate.quadPerimetre(6);
        System.out.println(d + " LM" + "\n");

        int a = triangleArea.trangArea();
        System.out.println(a + " m2");
        int b = triangleArea.triangPerimetre();
        System.out.println(b + " LM");
    }
}