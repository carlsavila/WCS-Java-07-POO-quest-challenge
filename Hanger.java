package quest07.Challenge;

import java.util.ArrayList;

public class Hanger {
    public static void main(String[] args) {

        ArrayList<Vehicule> listVehicules = new ArrayList<>();
        listVehicules.add(new Car("Toyota", 0));
        listVehicules.add(new Boat("Bateau", 0));

     for (Vehicule vehicule : listVehicules) {
        System.out.println(vehicule.doStuff());
     }   

    }
}
