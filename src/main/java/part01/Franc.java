package part01;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(this.amount * multiplier);
    }


}















