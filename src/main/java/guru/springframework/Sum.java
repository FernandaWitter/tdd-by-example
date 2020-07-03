package guru.springframework;

public class Sum implements Expression{
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend){
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(String to){
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}