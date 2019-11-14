package six_kuy;

public class ASum {

    //By given volume of the building (m) returns number of cubes need for build

    public static long findNb(long m) {
        long n = 1;
        long currentVolume = m;
        while (m > 0) {
            currentVolume = n * n * n;
            m -= currentVolume;
            n++;
        }
        if (m == 0) {
            return n - 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Long m = 40539911473216L;
        System.out.println(findNb(m));
    }
}
