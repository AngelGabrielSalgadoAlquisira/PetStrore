public class PetStore {
    private String Name;
    private String Species;
    private String race;

    public PetStore(String name, String species, String race) {
        this.Name = name;
        this.Species = species;
        this.race = race;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
