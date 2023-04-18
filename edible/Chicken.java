package edible;

import abstractclass.Animal;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "o o o...";
    }
    public String howToEat(){
        return "could be fried";
    }
}
