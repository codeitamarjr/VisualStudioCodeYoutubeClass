public class LessonMaths {

    public static void main(String[] args) {
        
        int result = Math.round(1.1F); // The Math class as loads of methods
        //The round method I can round a floating-poing number to a whole number
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1); //I cast Math to a int cuz the result is double=2.0 and I can't store double in a int
        //The ceil method will return the smaler integer that is greater than or equal to the number
        System.out.println(result2);

        int result3 = (int)Math.floor(3.1F);
        //The floor method is the largest integer that is smaller or equal to this number
        System.out.println(result3);

        int result4 = Math.max(1, 4);
        //The max method will returno the greather of two values, the min method will return the minimum number. This method is Overloaded which means can be used with int, long, float, double.
        System.out.println(result4);

        double result5 = Math.random();
        //The method random will get a random floating point number between 0 and 1
        int result6 = (int)Math.round(Math.random()*100); // I used round to get an integer of a random number and I explicit casting to int because the result is double
        System.out.println(result5);
        System.out.println(result6);


    }
    
}
