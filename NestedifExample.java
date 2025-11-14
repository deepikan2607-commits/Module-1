public class NestedifExample {
    public static void main(String[]args){
        int marks=85;
        if(marks>=50){
            System.out.println("you passed the exam");
            if(marks>=90){
                System.out.println("Grade:A+");
            }
        }
    }
}
