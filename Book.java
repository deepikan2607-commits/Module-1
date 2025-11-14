import java.util.Stack;

public class Book {
    String title;
    String author;
    double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
}
@override
public String toString(){
    return title+"by"+"author"+"(Rs"+price+")";
}
public static void main(String[]args){
    Stack<Book> s=new Stack<>();
    s.push(new Book("The White Tiger","Aravind Adiga",499));
    s.push(new Book("The God of small things","Arundhati Roy",399));
    s.push(new Book("Train to Pakistan", "Khushwant Singh", 350));
    s.push(new Book("Interpreter of Malaadies", "Jhumpa Lahiri", 420));
    s.push(new Book("A suitable Boy", "Vikram seth", 699));
    System.out.println("Stack after pushing books:");
    System.out.println(s);
    System.out.println("\nTop book (peek):"+s.peek());
    System.out.println();
}
}
