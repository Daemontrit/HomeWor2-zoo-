package Animals.java;

import food.java.Food;
import food.java.Meat;

public class Wolf extends Carnivorous implements Run, Voice {
    private int eatBalance=100;
    @Override
    public void run() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Волк побегал");
        }

    }

    @Override
    public void voice() {
        String s="auuuf";
        System.out.println(s);

    }
    public void eat(Food eda){
        if(eda instanceof Meat) {
            eatBalance+=60;
            System.out.println("Wolf поел");
        }
        else
            System.out.println("Эта еда не подходит для Wolf");
    }
}
