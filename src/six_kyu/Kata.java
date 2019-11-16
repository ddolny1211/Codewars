package six_kyu;

public class Kata {
    public static String expandedForm(int num) {
        String numInString = Integer.toString(num);
        if (numInString.length() == 1) {
            return numInString;
        }
        int numLength = numInString.length();
        StringBuilder expanded = new StringBuilder();
        for (int i = 0; i < numLength - 1; i++) {
            StringBuilder sb = new StringBuilder();
            if (numInString.charAt(i) > 48 && numInString.charAt(i) < 58) {
                char currentNum = numInString.charAt(i);
                sb.append(currentNum);
                sb.append("0".repeat(numLength - i - 1));
                if (expanded.length() > 1) {
                    expanded.append(" + ").append(sb);
                } else {
                    expanded.append(sb);
                }
            }
        }
        if ((int) numInString.charAt(numLength - 1) != 48) {
            expanded.append(" + ").append(numInString.charAt(numLength - 1));
        }
        return expanded.toString();
    }

    public static void main(String[] args) {
        Kata.expandedForm(70304);
        Kata.expandedForm(703040021);
        Kata.expandedForm(+2);
        Kata.expandedForm(90000000);
    }
}
