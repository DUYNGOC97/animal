package abstractclass;


import edible.Edible;

public class TestAnimal {
    public static void main(String[] args){
        Animal animal1 = new Chicken();
        Animal animal2 = new Tiger();
        System.out.println(animal1.makeSound());
        System.out.println(animal2.makeSound());
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

        }
    }
}
