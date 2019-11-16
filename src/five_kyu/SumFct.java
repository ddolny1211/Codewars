package five_kyu;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger current;
        BigInteger sum = BigInteger.ONE;
        int iterator = 0;
        while (iterator < n.intValue()) {
            current = first.add(second);
            first = second;
            second = current;
            sum = sum.add(current);
            iterator++;
        }
        sum = sum.multiply(new BigInteger("4"));
        return sum;
    }

    public static void main(String[] args) {
        SumFct.perimeter(new BigInteger("7"));

    }
}
