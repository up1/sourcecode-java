
public class FizzBuzz2 {

    public String sendAndReturn(int number) {
        String result = "" + number;
        if (หารสามและห้าลงตัว(number)) {
            result = "FizzBuzz";
        } else if (หารสามลงตัว(number)) {
            result = "Fizz";
        } else if (หารห้าลงตัว(number)) {
            result = "Buzz";
        }
        return result;

    }

    private boolean หารสามและห้าลงตัว(int number) {
        return หารสามลงตัว(number) && หารห้าลงตัว(number);
    }

    private boolean หารห้าลงตัว(int number) {
        return number % 5 == 0;
    }

    private boolean หารสามลงตัว(int number) {
        return number % 3 == 0;
    }

}
