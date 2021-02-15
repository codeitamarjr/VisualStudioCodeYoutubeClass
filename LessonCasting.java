public class LessonCasting {

    public static void main(String[] args) {
        
        short x = 1;
        int y = x+2;
        // x will be treated as a integer and its Implicit Casting by Java
        // byte > short > int > long > float > double
        System.out.println(y);

        double a = 1.1;
        double b = a+2; //Java will automatic Cast 2 for 2.0 to be more precise 
        System.out.println(b);

        double c = 1.1;
        int d = (int)c+2; //Now I have Explicit Casting that I want c be trated as 1 instead of 1.1 and can be just used with compatible types, I can't Casting a number with a String(!)
        System.out.println(d);

        String e="1";
        int f=Integer.parseInt(e)+2;
        //Integer is the wrapper classe of int, the method called paseInt get the number of a String
        //other wrapper class are Short.parseShort(), Float.parseFloat(), ...
        
        System.out.println(f);

    }
    
}
