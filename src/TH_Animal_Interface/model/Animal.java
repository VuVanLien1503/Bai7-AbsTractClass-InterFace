package TH_Animal_Interface.model;

import TH_Animal_Interface.Interface.Edible;

public abstract class Animal implements Edible{
    private String system=" ";

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Animal(String system) {
        this.system = system;
    }

    public Animal() {
    }

    public abstract String makeSound();
}

