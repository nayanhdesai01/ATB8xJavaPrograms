package Oct.ClassPractice.Class23102024_Exceptions;

public class Lab175_CustomExceptions {
    public static void main(String[] args) throws Exception {
Bank sbi = new Bank("INR",100);
Bank icici = new Bank("INR",120);
Bank jpMorgan = new Bank("USD",100);

        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jpMorgan));
    }
}
