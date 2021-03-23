package Animals.java;


import food.java.Food;
import food.java.Grass;

public class Duck extends Herbivore implements Swim, Voice, Fly {
    private int eatBalance=100;


    public void eat(Food eda){
        if(eda instanceof Grass) {
            eatBalance+=70;
            System.out.println("duck поела");

        }
        else
            System.out.println("Эта еда не подходит для duck");
    }

    @Override
    public void vzlet() {
        if (eatBalance <= 0) {
        System.out.println("нужна еда");

    } else {
        eatBalance -= 50;
        System.out.println("Утка взлетела");
    }

    }

    @Override
    public void posadka() {
        eatBalance-=10;
        System.out.println("утка села");

    }

    @Override
    public void fastSwim() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 50;
            System.out.println("Утка быстро поплавала");
        }

    }

    @Override
    public void slowlySwim() {
        if (eatBalance <= 0) {
            System.out.println("нужна еда");

        } else {
            eatBalance -= 30;
            System.out.println("Утка медленно поплавала");
        }

    }

    @Override
    public void golos() {
        String s="Kria";
        System.out.println(s);
    }
}
