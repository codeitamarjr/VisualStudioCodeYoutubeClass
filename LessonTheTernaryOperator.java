public class LessonTheTernaryOperator {

    public static void main(String[] args) {
        
        int income = 120_000;
        String className = income > 100_000 ? "First Class":"Economy";
        //in this case Java will check to store the first(true) or second(false) String.
        System.out.println(className);
    }
    
}
