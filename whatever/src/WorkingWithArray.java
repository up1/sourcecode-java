
public class WorkingWithArray {

    public static void main(String[] args) {
        int[] numbers1 = new int[5];
        numbers1[0] = 9;
        numbers1[1] = numbers1[0];
        for (int i : numbers1) {
            System.out.println(i);
        }

    }

}
