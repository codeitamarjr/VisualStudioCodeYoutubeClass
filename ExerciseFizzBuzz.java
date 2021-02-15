import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ExerciseFizzBuzz { //if the number is divisible by 5 we get fizz, if its divisible by 3 we get buzz and if are by both we get fizzbuzz, if its not we get the number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number ");
        int number = scanner.nextInt();

        if ((number % 5 == 0 && number % 3 == 0))
            System.out.println("FizzBuzz");
            else if ((number % 3) == 0)
            System.out.println("Buzz");
            else if ((number % 5) == 0)
            System.out.println("Fizz");
            else
            System.out.println(number);
    }
    
}
