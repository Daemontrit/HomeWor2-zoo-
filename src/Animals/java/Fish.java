package Animals.java;

import food.java.Food;
import food.java.Meat;

public class Fish extends Carnivorous implements Swim {
    private int eatBalance=100;
    @Override
    public void swim() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Рыба поплавала");
        }

    }
    public void eat(Food eda){
        if(eda instanceof Meat) {
            eatBalance+=70;
            System.out.println("Рыба поела");
        }
            else
            System.out.println("Эта еда не подходит для fish");
    }

}
