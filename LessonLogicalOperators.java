public class LessonLogicalOperators{

    public static void main(String[]args){

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; //Java will valuet from left to right, if the first expression is false it's stop and return false.
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligle = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        //First Java will check the () as bellow:
        //If one of those is true the boolean will be true and Java will continue to read the code out of the parentheses.
        //The not operator ! will reverse the boolean expression, it's meaning to be true the hasCriminalRecord needs to be false.
    }
}