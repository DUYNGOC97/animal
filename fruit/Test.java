package fruit;

public class Test {
    public static void main(String[] args) {
        Fruit f2 = new Apple();
        Fruit f1 = new Orange();
        System.out.println(f1.howToEat());
        System.out.println(f2.howToEat());
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for(Fruit fruits:fruit){
            System.out.println(fruits.howToEat());
        }

    }
}
