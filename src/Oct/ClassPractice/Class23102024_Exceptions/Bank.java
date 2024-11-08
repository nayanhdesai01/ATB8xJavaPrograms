package Oct.ClassPractice.Class23102024_Exceptions;

public class Bank {
    String currency;
    int amount;

    public Bank(String currencyName, int amount) {
        this.currency = currencyName;
        this.amount = amount;
    }

    public String getCurrencyName() {
        return currency;
    }

    public void setBankName(String currencyName) {
        this.currency = currencyName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception{
        if (!bankName.currency.equalsIgnoreCase("INR")) {
                throw new Exception("Currency Mismatch...,Can't give total");
        }
            return bankName.amount + this.amount;
    }
}

