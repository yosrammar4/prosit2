import java.util.Scanner;

public class ZooManagment {

    public static void main(String[] args) {
        //  String  = "my zoo";
        // int nbrCages = 20;
        System.out.println("entrer le nom de zoo :");
        Scanner zooName = new Scanner(System.in);
        String  Name=zooName.nextLine();
        System.out.println("entrer le nombre de cage :");
        Scanner nbrCages = new Scanner(System.in);
        String  nbr=nbrCages.nextLine();


        System.out.println(Name + " comporte "+ nbr +" " + " cages");

    }

}