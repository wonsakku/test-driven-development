package part01;

public class Franc {

    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return this.amount == dollar.amount;
    }
}















