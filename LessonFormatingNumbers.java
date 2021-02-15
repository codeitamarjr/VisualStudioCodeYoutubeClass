import java.text.NumberFormat;

public class LessonFormatingNumbers {

    public static void main(String[] args) {
        //some classes are abstract which means I don't need to create a new instance of them
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //The class NumberFormat have a method called getCurrencyInstance which creates a instance of a number format class and return it, it's a Factory Method.
        String result = currency.format(1234567.891);
        //this object currency has a method for formating values and it's Oveloaded, I stored this result of currency on a String
        System.out.println(result);

        NumberFormat percentageNumberFormat = NumberFormat.getPercentInstance();
        //I use the class NumberFormat and a method get.PercentInstance
        String percentageNumber = percentageNumberFormat.format(0.1);
        //I store in a String the result of a method to format the percentageNumberFormat which is double as a percent
        System.out.println(percentageNumber);
        
        //I also can use a Method Chaining, I'm chaining multiple methods together to clean the code:
        String percentageNumberChaining = NumberFormat.getPercentInstance().format(0.2);
        // I stored in a String a Class NumberFormat with the method get.PercentInstance and other method format
        System.out.println(percentageNumberChaining);
        
    }
    
}
