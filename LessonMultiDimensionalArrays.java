import java.util.Arrays;

public class LessonMultiDimensionalArrays {

    public static void main(String[] args) {
        
        int[][][] numbers = new int[2][3][5];
        numbers[0][0][0]=1;
        System.out.println(Arrays.deepToString(numbers));

        int[][] numbers2 = {{2,3,4},{5,6,7}};
        System.out.println(Arrays.deepToString(numbers2));
    }
    
}
