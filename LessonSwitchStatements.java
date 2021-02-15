public class LessonSwitchStatements {
    
    public static void main(String[] args) {
        
        //we use Switch Statements to execute different parts of code depending on the value of an expression
        String role="admin";

        switch(role){
            case "admin":
                System.out.println("You're an addmin");
                break;
            case "moderator"
                System.out.println("You're a moderator");
                break;
            defaut:
                System.out.println("You're a guest");
        }
    }
}
