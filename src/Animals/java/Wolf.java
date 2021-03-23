package Animals.java;

import food.java.Food;
import food.java.Meat;

public class Wolf extends Carnivorous implements Run, Voice {
    private int eatBalance=100;

    public void eat(Food eda){
        if(eda instanceof Meat) {
            eatBalance+=60;
            System.out.println("Wolf поел");
        }
        else
            System.out.println("Эта еда не подходит для Wolf");
    }

    @Override
    public void fastRun() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Волк быстро побегал");
        }

    }

    @Override
    public void slowlyRun() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 30;
            System.out.println("Волк медленно побегал");
        }

    }

    @Override
    public void golos() {
        String s="auuuf";
        System.out.println(s);
    }
}
