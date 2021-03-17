import Animals.java.*;
import food.java.Grass;
import food.java.Meat;

public class Zoo {


    public static void main(String[] args) {
        Worker worker = new Worker();
        Cat cat = new Cat();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Horse horse = new Horse();
        Wolf wolf = new Wolf();
        Zebra zebra = new Zebra();
        Meat meat = new Meat();
        Grass grass = new Grass();
        worker.feed(cat, grass);
        new Worker().feed(cat, meat);
        cat.run();
        cat.voice();
        fish.swim();
        fish.eat(meat);
        duck.eat(meat);
        duck.fly();
        duck.eat(grass);
        duck.swim();
        duck.voice();
        horse.eat(meat);
        horse.eat(grass);
        horse.run();
        horse.swim();
        horse.voice();
        wolf.eat(meat);
        wolf.eat(grass);
        wolf.run();
        wolf.voice();
        zebra.eat(meat);
        zebra.eat(grass);
        zebra.run();
        zebra.voice();
        worker.getVoid(zebra);

        Swim [] animals = new Swim[3];

        animals[0] = new Fish();
        animals[1] = new Duck();
        animals[2] = new Horse();

        for (int i = 0; i < animals.length; i++) {
                animals[i].swim();
        }


    /*public void AnimalPrud(Animal animal){
        if ((animal instanceof Swim)&&(animal instanceof Herbivore)){
            System.out.println(animal+" умеет плавать и может плавать в этом пруду ");

        }
        else {
            System.out.println("этому живтному нельзя здесь плавать или оно не умеет плавать ");

        }
    }

     */

    }
}

