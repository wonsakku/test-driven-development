package part01;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier){
        this.amount *= multiplier;
    }
}
