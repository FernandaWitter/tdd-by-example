package guru.springframework;

public interface Expression {
    public Money reduce(Bank bank, String to);
    public Expression plus(Expression addend);
}
