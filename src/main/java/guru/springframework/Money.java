package guru.springframework;

public class Money implements Expression {

    protected final int amount;
    protected final String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){ return currency;}

    public static Money dollar(int amount){return new Money(amount, "USD");}
    public static Money franc(int amount){return new Money(amount, "CHF");}

    public Expression times(int multiplier){
        return new Money(this.amount*multiplier, this.currency);

    }

    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }

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

    @Override
    public Money reduce(Bank bank, String to) {
        return new Money(amount/bank.rate(this.currency, to), to);
    }
}
