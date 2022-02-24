package newton.school.dsa.recursion;

public class Factorial {

    static int factorial(int number) {
        if (number == 1)
            return number;

        return number * factorial(number - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 10 : " + factorial(5));
    }
}
