package part01;

import java.util.Objects;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }

}















