public class Vowels {

    //Return number of vowels in the given string
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        String str = "abracadabra";
        System.out.println(getCount(str));
    }

}
