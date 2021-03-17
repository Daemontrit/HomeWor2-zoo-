package Animals.java;

import food.java.Food;
import food.java.Grass;

public class Zebra extends Herbivore implements Run, Voice {
    private int eatBalance=100;
    @Override
    public void run() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("зебра побегала");
        }

    }

    @Override
    public void voice() {
        String s="Так говорит зебра: mmmmm";
        System.out.println(s);

    }
    public void eat(Food eda){
        if(eda instanceof Grass) {
            eatBalance+=60;
            System.out.println("zebra поела");
        }
        else
            System.out.println("Эта еда не подходит для zebra");
    }
}
