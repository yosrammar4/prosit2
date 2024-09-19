public class Zoo {
    private String zooName;
    private Animal[] animals;
    private String city;
    private int nbCages;

    public Zoo(String zooName, String city, int nbCages) {
        animals = new Animal[nbCages];
        this.zooName = zooName;
        this.city = city;
        this.nbCages = nbCages;

    }
    public void displayZoo() {
        System.out.println("Zoo Name: "+zooName);
        System.out.println("Nombre de Cages: "+nbCages);
        System.out.println("City: "+city);
    }


}