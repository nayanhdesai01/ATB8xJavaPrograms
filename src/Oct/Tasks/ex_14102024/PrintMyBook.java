package Oct.Tasks.ex_14102024;

public class PrintMyBook extends Book{


    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name+","+author+","+price);
    }
}
