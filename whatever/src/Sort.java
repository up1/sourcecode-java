
public class Sort {

    public int[] of(int[] input) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count++;
                }
            }

        }

        return input;
    }

}
