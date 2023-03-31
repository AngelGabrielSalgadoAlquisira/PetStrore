public class Feline extends PetStore {

    private double height;
    private double longitude;
    private double amountSleep;

    public Feline(String name, String species, String race) {
        super(name, species, race);
    }

    public Feline(String name, String species, String race, double height, double longitude, double amountSleep) {
        super(name, species, race);
        this.height = height;
        this.longitude = longitude;
        this.amountSleep = amountSleep;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAmountSleep() {
        return amountSleep;
    }

    public void setAmountSleep(double amountSleep) {
        this.amountSleep = amountSleep;
    }

    public String toString(){
        String texto = "El " + getSpecies() +
                "\n se llama " + getName() +
                "\n de la raza " + getRace() +
                "\n tiene una altura de " + getHeight() + "centimetros"  +
                "\n y una longitud de " + getLongitude() + "Centomtros" +
                        "\n y tiene una aproximado de " + getAmountSleep() + "horas de sueño";
        return texto;
    }

    public String sonido(){
        return "meow meow";
    }

}
