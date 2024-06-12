package quest07.Challenge;

public abstract class Vehicule {

    private String brand;
    private int kilometers;

    public Vehicule(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public void setBrand  (String brand) {
        this.brand = brand;
    }
    public String getBrand  () {
        return this.brand;
    }
    public void setKilometers  (int kilometers) {
        this.kilometers = kilometers;
    }
    public int getKilometers  () {
        return this.kilometers;
    }

    public abstract String doStuff();
}