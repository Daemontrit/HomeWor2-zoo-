package Animals.java;

import food.java.Food;
import food.java.Meat;

public class Cat extends Carnivorous implements Run, Voice {
    private int eatBalance=100;

    public void eat(Food eda) {
        if (eda instanceof Meat) {
            eatBalance += 80;
            System.out.println("Кошка поела");
        }
        else{
            System.out.println("Эта еда не подходит для Кошки");
        }
    }


    @Override
    public void fastRun() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Кошка быстро побегала");
        }

    }

    @Override
    public void slowlyRun() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 30;
            System.out.println("Кошка медленно побегала");
        }

    }

    @Override
    public void golos() {
        String s="meaaw";
        System.out.println(s);


    }
}
