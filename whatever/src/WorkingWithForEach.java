
public class WorkingWithForEach {

    public static void main(String[] args) {
       
        int[] numbers = { 1, 2, 3, 4, 5 };
        // Old way
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // For each
        for (int i : numbers) {
            System.out.println(i);
        }

    }

}
