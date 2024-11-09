package Oct.ClassPractice.Class30102024_CollectionPart2;

import java.util.Stack;

public class Lab193_StackFunctions {
    public static void main(String[] args) {
        Stack<String > books = new Stack();
        books.push("Python");
        books.push("Java");
        books.push("C#");
        books.add("C++");
        System.out.println(books.size());
        System.out.println(books);
        System.out.println(books.peek());
        System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.empty());
        System.out.println(books.add("Ruby"));
        System.out.println("------");
        System.out.println(books);
        books.add(0,"Testing");
        System.out.println(books);
        System.out.println(books.get(4));


    }
}
