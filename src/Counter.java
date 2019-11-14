public class Counter {
    //Check how many sheeps are present by given array
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean isPresent : arrayOfSheeps) {
            if (isPresent != null) {
                if (isPresent) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
