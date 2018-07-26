
public class PrimeFactor {

    public String of(int number) {
        /*
         * 4 => 22 4%2 == 0 -> 2 4/2 => 2 2%2 == 0 -> 2
         */
        String result = "";

        for (int primeNumber = 2; number > 1; primeNumber++) {
            for (; number % primeNumber == 0; 
                    number = number / primeNumber) {
                result = result + primeNumber;
            }
        }

        return result;
    }

}
