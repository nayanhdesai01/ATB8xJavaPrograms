package Oct.Tasks.ex_14102024;
/**✅ Problem Statement
 Book class which has an abstract method getDetails(),name, author, price.
 PrintMyBook class that inherits from the Book class.
 abstract
 Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
 // Output
 "Harry Potter, J.k. Rowling, 100"
 */

abstract class Book {
String name;
String author;
int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}
