package sec9.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird bird = new Bird("Finch") {
            @Override
            public void fly() {

            }
        };
        bird.breathe();
        bird.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();


    }
}
