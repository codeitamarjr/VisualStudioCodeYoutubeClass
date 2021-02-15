import java.util.Scanner;

public class LessonReadingInput{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //The Scanner class will get input data, after that I creat the scanner object(new Scanner) and I'm gonna read the data from the terminal window(System.in)

        //System.out.print("Age: ");
        //byte age = scanner.nextByte();

        System.out.println("Name: ");
        String name = scanner.nextLine().trim();
        //nextLine will get the whole line and trim will remove the spaces from the front e at the end
        //I'm storing in a byte variable called age some data which came from de scanner method nextByte
        System.out.println("Your name is "+name);
    }
}