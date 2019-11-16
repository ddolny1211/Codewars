package six_kuy;

public class Camel {
    public static String camelCase(String str) {
        if (str.equals("")) {
            return str;
        }
        String[] splittedString = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : splittedString) {
            if (word.length() > 0) {
                String wordUpperCase = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                sb.append(wordUpperCase);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Camel.camelCase("hello case");
        Camel.camelCase("camel case word");
        Camel.camelCase("jkdhsakjhdkjhgJHGJjHgJHgjhJHFVkhlpjhkhkgGghFJHfgjhgH");
        Camel.camelCase("      a          b       s");
    }
}
