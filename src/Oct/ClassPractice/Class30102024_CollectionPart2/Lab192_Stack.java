package Oct.ClassPractice.Class30102024_CollectionPart2;

import java.util.Stack;

public class Lab192_Stack {
    public static void main(String[] args) {
        Stack<String> s = new Stack();
        s.add("John");
        s.add("Smith");
        System.out.println(s);
        //LIFO
        Stack<String > books = new Stack();
        books.push("Python");
        books.push("Java");
        books.push("C#");
        System.out.println("Stack of books:"+books);
        System.out.println(books.peek());
        System.out.println("After peeking"+books);
        System.out.println(books.pop());
        System.out.println("After pop"+books);

    }
}
