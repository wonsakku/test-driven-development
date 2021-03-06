package part01;

public class Money implements Expression{

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }


    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount &&
                currency().equals(money.currency());
    }

    Expression times(int multiplier){
        return new Money(this.amount * multiplier, this.currency);
    }

    String  currency(){
        return this.currency;
    };

    public String toString(){
        return this.amount + " " + this.currency;
    }

    public Expression plus(Expression added) {
        return new Sum(this, added);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

}



