public class fizzbuzz{
    public static boolean fizzBuzz(int number) {
        if (number % 3 != 0 && number % 5 != 0) {
           return true;
        }
        return false;
    }
}