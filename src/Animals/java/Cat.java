package Animals.java;

import food.java.Food;
import food.java.Meat;

public class Cat extends Carnivorous implements Run, Voice {
    private int eatBalance=100;
    @Override
    public void run() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Кошка побегала");
        }


    }

    @Override
    public void voice() {
        String s="meaaw";
        System.out.println(s);

    }
    public void eat(Food eda) {
        if (eda instanceof Meat) {
            eatBalance += 80;
            System.out.println("Кошка поела");
        }
        else{
            System.out.println("Эта еда не подходит для Кошки");
        }
    }


}
