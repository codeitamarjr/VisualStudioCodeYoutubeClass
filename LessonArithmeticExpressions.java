public class LessonArithmeticExpressions {

    public static void main(String[] args) {
        
        double result = (double)10/(double)3;
        System.out.println(result);

        int x=1;
        int y=x++; // incremental as a postfix, first y will be 1 and then x will be 2, if it was ++x(it's called prefix) so x will be 2 and y will be 2 as well.
        x+=2; //it's the same as x=x+2 and it's called Augmented or Compound Assignment Operator, can be used with *,+,-,/
        System.out.println(x); 
        System.out.println(y); 

    }
    
}
