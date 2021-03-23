import Animals.java.*;
import food.java.Govyadina;
import food.java.Grass;
import food.java.Meat;
import food.java.Ukrop;

import java.util.ArrayList;
import java.util.List;

public class Zoo {


    public static void main(String[] args) {
        Duck duck = new Duck();
        Worker worker = new Worker();
        Meat meat = new Govyadina();
        Grass grass = new Ukrop();
        duck.vzlet();
        duck.posadka();

        Swim [] animals = new Swim[3];

        animals[0] = new Fish();
        animals[1] = new Duck();
        animals[2] = new Horse();

        for (int i = 0; i < animals.length; i++) {
                animals[i].fastSwim();
                animals[i].slowlySwim();
        }

        ArrayList<Animal> list = new ArrayList<Animal>();{
            Cat cat = new Cat();
            Fish fish = new Fish();
            Horse horse = new Horse();
            Wolf wolf = new Wolf();
            Zebra zebra = new Zebra();
            list.add(cat);
            list.add(duck);
            list.add(fish);
            list.add(horse);
            list.add(wolf);
            list.add(zebra);
            for (int i=0;i< list.size();i++){
                worker.feed(list.get(i),meat);
                worker.feed(list.get(i),grass);
                worker.getVoid((Voice) list.get(i));
            }
            cat.fastRun();
            cat.slowlyRun();
            horse.fastRun();
            horse.slowlyRun();
            wolf.fastRun();
            wolf.slowlyRun();
            zebra.fastRun();
            zebra.slowlyRun();


        }
    }
}

