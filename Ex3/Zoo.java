public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
     int compteurAnimaux;


    public Zoo(String name,String city) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
        this.compteurAnimaux = 0;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {

        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }





    public boolean addAnimal(Animal animal) {
        if (compteurAnimaux < nbrCages) {
            for (int i = 0; i < compteurAnimaux; i++) {
                if (animals[i].equals(animal)) {
                    return false;
                }
            }
            animals[compteurAnimaux] = animal;
            compteurAnimaux++;
            return true;
        }

        return false;
    }



    public void afficherAnimaux() {
        for (int i = 0; i < compteurAnimaux; i++) {
            System.out.println( animals[i]);
        }
    }



    public int searchAnimal(Animal animal) {
        for (int i = 0; i < compteurAnimaux; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = animals[compteurAnimaux - 1];
            compteurAnimaux--;
            return true;
        }
        return false;
    }

    public boolean isZooFull() {

        return compteurAnimaux == nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.compteurAnimaux > z2.compteurAnimaux) {
            return z1;
        } else {
            return z2;
        }
    }

    public static void main(String[] arg){

        Animal lion = new Animal("Lion", "Simba", 5, true);

        Zoo myZoo = new Zoo("Mon zoo", "Paris");

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(new Animal("Felidae", "Lion", 5, true)));
        System.out.println(myZoo.addAnimal(new Animal("Canidae", "Chien", 3, true)));

        myZoo.displayZoo();

        myZoo.afficherAnimaux();

        System.out.println(myZoo.searchAnimal(lion));

        System.out.println(myZoo.removeAnimal(lion));

        System.out.println(myZoo.isZooFull());

        Zoo z2 = new Zoo("Zoo 2", "Lyon");
        z2.addAnimal(new Animal("Felidae", "Lion", 5, true));
        z2.addAnimal(new Animal("Canidae", "Chien", 3, true));
        z2.addAnimal(new Animal("Ursidae", "Ours", 10, true));

        System.out.println(Zoo.comparerZoo(myZoo, z2));

    }

    
}
