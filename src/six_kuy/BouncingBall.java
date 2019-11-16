package six_kuy;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
            int passingCounter = 1;
            h = bounce * h;
            while (h > window) {
                h = bounce * h;
                passingCounter += 2;
            }
            return passingCounter;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(BouncingBall.bouncingBall(30, 0.8, 3));
    }
}
