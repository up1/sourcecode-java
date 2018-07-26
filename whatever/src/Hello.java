public class Hello {
    public static void main(String... args) {
        Hello hello = new Hello();
        hello.say(100);
    }

    // Constant
    private static final int NUMBER_TWO = 2;
    // Class variable
    public static int index = 1;
    // Instance variable
    private int number1;
    private int number2;
    private int number3;
    private int number4;

    private void say(int number) {
        int index = 0; // Local variable
        System.out.println(index); // 0
        System.out.println(this.index); // ไม่มีใครเขาเขียนแบบนี้1
        System.out.println(Hello.index); // 1
        System.out.println(number); // 100
        System.out.println(this.number1); // 3
        System.out.println(NUMBER_TWO); // 2
    }

}
