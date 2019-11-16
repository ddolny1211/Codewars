package seven_kyu;

class XO {

    //Check if a given String has the same amount of 'x' and 'o'
    //Return type: boolean
    public static boolean getXO(String str) {
        int xCounter = 0;
        int oCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                xCounter++;
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                oCounter++;
            }
        }
        if (xCounter == oCounter) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "xxXooo";
        System.out.println(getXO(str));
    }
}
