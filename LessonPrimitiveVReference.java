import java.awt.Point;

public class LessonPrimitiveVReference {

public static void main(String[] args) {
    
    Point point1 = new Point(1,1);
    Point point2 = point1;
    //Reference types are keep the addres on the memory, on the flip side of this primitive types are copy of the value
    point1.x = 2;

    System.out.println(point2);
}    
}
