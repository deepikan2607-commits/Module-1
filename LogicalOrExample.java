public class LogicalOrExample {
    public static void main(String[]args){
        boolean isStudent=true;
        boolean isTeacher=false;
        if(isStudent||isTeacher){
            System.out.println("you can enter the campus.");
        }else{
            System.out.println("Access denied.");
        }
    }
}
