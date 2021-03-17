package Animals.java;


import food.java.Food;
import food.java.Grass;

public class Duck extends Herbivore implements Swim, Voice, Fly {
    private int eatBalance=100;
    @Override
    public void fly() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Утка полетала");
        }

    }

    @Override
    public void swim() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Утка поплавала");
        }


    }

    @Override
    public void voice() {
        String s="Kria";
        System.out.println(s);

    }
    public void eat(Food eda){
        if(eda instanceof Grass) {
            eatBalance+=70;
            System.out.println("duck поела");

        }
        else
            System.out.println("Эта еда не подходит для duck");
    }
}
