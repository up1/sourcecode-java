
public class PrimeFactor {

    public String of(int number) {
        /*
         * 4 => 22 4%2 == 0 -> 2 4/2 => 2 2%2 == 0 -> 2
         */
        String result = "";
        int primeNumber = 2;
        while(number > 1) {
            while (number % primeNumber == 0) {
                result = result + primeNumber;
                number = number / primeNumber;
            }
            primeNumber++;
        }
        
        return result;
    }

}
