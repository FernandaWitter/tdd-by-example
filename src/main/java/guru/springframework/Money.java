package guru.springframework;

public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount){return new Money(amount, "USD");}
    public static Money franc(int amount){return new Money(amount, "CHF");}

    public Money times(int multiplier){
        return new Money(this.amount*multiplier, this.currency);
    };
    public String currency(){ return currency;};

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.currency().equals(money.currency()) && amount == money.amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
