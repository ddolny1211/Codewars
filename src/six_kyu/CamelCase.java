package six_kyu;

public class CamelCase {
    static String toCamelCase(String s) {
        String[] splittedString = s.split("[-_]");
        StringBuilder sb = new StringBuilder();
        boolean wasFirstWord = false;
        for (String word : splittedString) {
            if (wasFirstWord) {
                String wordUpperCase = word.substring(0, 1).toUpperCase() + word.substring(1);
                sb.append(wordUpperCase);
            } else {
                sb.append(word);
                wasFirstWord = true;
            }
        }
        System.out.println(sb.toString());

        return sb.toString();
    }

    public static void main(String[] args) {
        CamelCase.toCamelCase("the-stealth-warrior");
        CamelCase.toCamelCase("The_Stealth_Warrior");
    }
}
