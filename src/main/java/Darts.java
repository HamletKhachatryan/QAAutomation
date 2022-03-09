import java.util.Random;

public class Darts {

    Darts() {

    }

    public int firstPlayer() {
        Random points = new Random();
        int pooint = points.nextInt(58);
        return pooint;
    }

    public int secondPlayer() {
        Random points = new Random();
        int pooint = points.nextInt(36);
        return pooint;
    }

    public int thirdPlayer() {
        Random points = new Random();
        int pooint = points.nextInt(40);
        return pooint;
    }

    public int fourthPlayer() {
        Random points = new Random();
        int pooint = points.nextInt(50);
        return pooint;
    }


    public static void main(String[] args) {

        Darts teamOne = new Darts();
        Darts teamSecond = new Darts();
        Darts teamThird = new Darts();


        System.out.println("The winner of First team: first player");

        int f = (teamOne.firstPlayer() + teamOne.firstPlayer() + teamOne.firstPlayer());
        System.out.println(f);


        System.out.println("The winner of second team: second player");

        int s = (teamSecond.secondPlayer() + teamSecond.secondPlayer() + teamSecond.secondPlayer());
        System.out.println(s);

        System.out.println("The winner of third team: fourth player");
        int t = (teamThird.fourthPlayer() + teamThird.fourthPlayer() + teamThird.fourthPlayer());
        System.out.println(t);

        if (f > s && f > t)
            System.out.println("The first player of the first team showed the best result: " + f);
        else if (s > f && s > t)
            System.out.println("The second player of the second team showed the best result: " + s);
        else {
            System.out.println("The fourt player of the third team showed the best result: " + t);
        }
    }
}
