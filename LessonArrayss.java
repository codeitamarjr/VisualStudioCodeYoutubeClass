import java.util.Arrays;

public class LessonArrayss {

    public static void main(String[] args) {
        
        int [] numbers = new int[5]; //I define 5 items inside this array
        //I use arrays to store a list of something, could be a list of numbers, names ...
        //I can acces a individual items in this arrays using index
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        
        System.out.println(Arrays.toString(numbers));
    
        int [] numbers2 = {2,3,0,5,1,4};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    
    }
    
}
