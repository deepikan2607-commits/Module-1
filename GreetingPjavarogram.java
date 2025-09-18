import java.util.Scanner;
public class GreetingPjavarogram {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Print enter your name:");
        String name=scanner.nextLine();
        System.out.print("Print enter your age:");
        int age=scanner.nextInt ();
        scanner.close();
        System.out.print("\nHello,"+name+"!you are"+age+"you old.Nice to meet!");
    }
}

