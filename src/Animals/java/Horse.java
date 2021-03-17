package Animals.java;

import food.java.Food;
import food.java.Grass;

public class Horse extends Herbivore implements Run, Voice,Swim {
    private int eatBalance=100;
    @Override
    public void run() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Лошадь побегала");
        }

    }

    @Override
    public void voice() {
        String s="igogo";
        System.out.println(s);

    }
    public void eat(Food eda){
        if(eda instanceof Grass) {
            eatBalance+=80;
            System.out.println("Horse поела");
        }
            else
            System.out.println("Эта еда не подходит для horse");
    }

    @Override
    public void swim() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Лошадь поплавала");
        }

    }
}
