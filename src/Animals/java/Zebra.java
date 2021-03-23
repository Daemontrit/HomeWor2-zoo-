package Animals.java;

import food.java.Food;
import food.java.Grass;

public class Zebra extends Herbivore implements Run, Voice {
    private int eatBalance=100;

    public void eat(Food eda){
        if(eda instanceof Grass) {
            eatBalance+=60;
            System.out.println("zebra поела");
        }
        else
            System.out.println("Эта еда не подходит для zebra");
    }

    @Override
    public void fastRun() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("зебра быстро побегала");
        }



    }

    @Override
    public void slowlyRun() {
        if (eatBalance <= 0) {
        System.out.println("нужна еда");

    } else {
        eatBalance -= 30;
        System.out.println("зебра медленно побегала");
    }


    }

    @Override
    public void golos() {
        String s="Так говорит зебра: mmmmm";
        System.out.println(s);
    }
}
