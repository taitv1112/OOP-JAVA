package AsbClassAnimalAndInterfaceEdible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "Ăn thịt, ăn thịt !";
    }
}
