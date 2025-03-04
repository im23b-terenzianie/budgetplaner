import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Kontostand anzeigen: A" +
                "\nEinnahme hinzufügen: B" +
                "\nAusgabe hinzufügen: C" +
                "\nAusgaben anzeigen: D" +
                "\n X zum Abbrechen");
        while (true) {
            String input = userinput.nextLine();
            if (input.equals("A")) {
                System.out.println("Kontostand =");
            } else if (input.equals("B")) {
                System.out.println("Einnahme hinzufügen:");
            } else if (input.equals("C")) {
                System.out.println("Ausgabe hinzufügen:");
            } else if (input.equals("D")) {
                System.out.println("Ausgaben:");
            } else if (input.equals("X")){
                System.out.println("Programm beendet.");
                break;
            } else {
                System.out.println("Error");
            }
        }
    }
}


