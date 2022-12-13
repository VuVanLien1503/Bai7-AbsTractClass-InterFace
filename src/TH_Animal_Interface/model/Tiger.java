package TH_Animal_Interface.model;

import TH_Animal_Interface.Interface.Edible;

public class Tiger extends Animal {
    double cannang ;

    public Tiger(double cannang) {
        super();
        this.cannang = cannang;
    }

    public Tiger() {
    }

    @Override
    public String makeSound() {
        return "Sound: Tiger";
    }

    @Override
    public String howToEat() {
        return "Nấu Cao";
    }
}
