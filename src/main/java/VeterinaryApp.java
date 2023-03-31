public class VeterinaryApp {
    public static void main(String[] args) {
        Canine canine = new Canine("Loky","Canino","Labrador");
        canine.setAvergLife(13);
        canine.setRaceSize("Mammalia");
        canine.setTopRatin("Lobo");

        Feline feline = new Feline("Cooper","Felino","americano");
        feline.setAmountSleep(13);
        feline.setHeight(23.0);
        feline.setLongitude(45.0);

        System.out.println("=====Metodo del canino===== \n" +canine.toString() );
        System.out.println("=====Metodo del felino===== \n" +feline.toString());

        System.out.println("==========================");

        System.out.println("El perro hace: " + canine.sonido());
        System.out.println("El gato hace: " + feline.sonido());

    }

}
