public class LessonStrings {

    public static void main(String[] args) {

        String message = "  Hello World "+"!!"; 
        //String is a reference type in Java
        //because its a reference type we can acces diferent data inside this reference
        //because it's a reference type it's has members that can be accesed with dot operator
        
        System.out.println(message.endsWith("!!")); //the result is true because its finish with !!
        System.out.println(message.startsWith("!!")); //the result is false because my String don't starts with !!
        System.out.println(message.length());//to get the lenght of the String, would be good to check the imput of a user
        System.out.println(message.indexOf("H")); //the result is 0
        System.out.println(message.indexOf("e")); //the result is 1
        System.out.println(message.indexOf("l")); //the result is 2 //it's the index of the first caracter
        System.out.println(message.indexOf("sky")); //the result would be -1, because I dont have "sky" on the message
        System.out.println(message.replace("!", "*")); //in this case I replace all !! by **
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());//I can remove the spaces from the begining or of the end of the String
        System.out.println(message); // String are inmutable
        
    }
}
