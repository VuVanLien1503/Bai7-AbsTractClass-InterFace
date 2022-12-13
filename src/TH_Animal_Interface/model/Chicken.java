package TH_Animal_Interface.model;

import TH_Animal_Interface.Interface.Edible;

public class Chicken extends Animal  {
    @Override
    public String makeSound() {
        return "Sound: Chicken";
    }


    @Override
    public String howToEat() {
        return "Sào xả ớt";
    }
}
