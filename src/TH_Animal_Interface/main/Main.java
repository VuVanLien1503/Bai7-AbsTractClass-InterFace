package TH_Animal_Interface.main;


import TH_Animal_Interface.Interface.Edible;
import TH_Animal_Interface.model.Animal;
import TH_Animal_Interface.model.Chicken;
import TH_Animal_Interface.model.Tiger;

public class Main {
    public static void main(String[] args) {

        Animal[] listArrAnimal = new Animal[2];
        listArrAnimal[0] = new Tiger();
        listArrAnimal[1] = new Chicken();
        for (Animal a :
                listArrAnimal) {
            System.out.println(a.makeSound());
        }
    }
}
