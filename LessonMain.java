import java.util.Date;

public class LessonMain{

    public static void main(String[] args) {

        byte age = 30; //Primitive type to store simple objects
        Date now = new Date();
        //Reference type like Date needs the memory to be alocated: Date is a class, "now" is an instance of Date class wich is stored in a "new" space on the memory Date
        //an object is an instance of a Class( Object now of an instance Date)
        System.out.println(now);
    }
}