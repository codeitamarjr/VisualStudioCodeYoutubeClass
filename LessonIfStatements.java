import javax.lang.model.util.ElementScanner14;

public class LessonIfStatements {

    public static void main(String[] args) {
        
        int temp = 32;
        if (temp > 30){ //if the result is true Java will execute all code inside braces, and we just use in case of multiple statements
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }   
            else if (temp >20)
                System.out.println("Beatiful day");
                else //the last is just else
                    System.out.println("Cold day");
    }
    
}
