import Animals.java.Voice;
import food.java.Food;
import Animals.java.Animal;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoid(Voice animal) {
            animal.voice();
    }
}


