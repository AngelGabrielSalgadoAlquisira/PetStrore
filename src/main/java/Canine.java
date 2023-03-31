public class Canine extends PetStore {

    private int AvergLife;
    private String RaceSize;
    private String TopRatin;

    public Canine(String name, String species, String race) {
        super(name, species, race);
    }

    public Canine(String name, String species, String race, int avergLife, String raceSize, String topRatin) {
        super(name, species, race);
        AvergLife = avergLife;
        RaceSize = raceSize;
        TopRatin = topRatin;
    }

    public int getAvergLife() {
        return AvergLife;
    }

    public void setAvergLife(int avergLife) {
        AvergLife = avergLife;
    }

    public String getRaceSize() {
        return RaceSize;
    }

    public void setRaceSize(String raceSize) {
        RaceSize = raceSize;
    }

    public String getTopRatin() {
        return TopRatin;
    }

    public void setTopRatin(String topRatin) {
        TopRatin = topRatin;
    }

    public String toString(){
        String texto = "El " + getSpecies() +
                "\n de la familia " + getRaceSize() +
                "\n y de clase superior " + getTopRatin() +
                "\n se llama " + getName() +
                "\n de la raza " + getRace() +
                "\n tiene un promedio de vida de:" + getAvergLife() +"años";
        return texto;
    }

    public String sonido() {
        return "Guau Guau";
    }

}

