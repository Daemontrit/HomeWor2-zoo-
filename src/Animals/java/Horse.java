package Animals.java;

import food.java.Food;
import food.java.Grass;

public class Horse extends Herbivore implements Run, Voice,Swim {
    private int eatBalance=100;

    public void eat(Food eda){
        if(eda instanceof Grass) {
            eatBalance+=80;
            System.out.println("Horse поела");
        }
            else
            System.out.println("Эта еда не подходит для horse");
    }


    @Override
    public void fastRun() {
        if (eatBalance <= 0) {
        System.out.println("нужна еда");

    } else {
        eatBalance -= 30;
        System.out.println("Лошадь быстро побегала");
    }

    }

    @Override
    public void slowlyRun() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 20;
            System.out.println("Лошадь медленно побегала");
        }

    }

    @Override
    public void fastSwim() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 30;
            System.out.println("Лошадь быстро поплавала");
        }

    }

    @Override
    public void slowlySwim() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 20;
            System.out.println("Лошадь медленно поплавала");
        }

    }

    @Override
    public void golos() {
        String s="igogo";
        System.out.println(s);
    }
}
