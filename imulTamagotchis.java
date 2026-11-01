import java.util.Scanner;
 
public class imulTamagotchis {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Combien de tamagotchis ? ");
        int n = Integer.parseInt(sc.nextLine().trim());
 
        Tamagotchi[] colonie = new Tamagotchi[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Quel nom pour le nouveau tamagotchi : ");
            colonie[i] = new Tamagotchi(sc.nextLine().trim());
        }
 
        int cycle = 0;
        while (true) {
            cycle++;
            System.out.println("-------Cycle no " + cycle + "------");
 
            // Chaque tamagotchi vit un cycle
            for (Tamagotchi t : colonie) {
                if (!t.vivre()) {
                    System.out.println("PERDU !!");
                    return;
                }
            }
 
            // Victoire : tous ont atteint leur âge limite
            boolean tousArrives = true;
            for (Tamagotchi t : colonie) {
                if (!t.ageLimite()) {
                    tousArrives = false;
                    break;
                }
            }
            if (tousArrives) {
                System.out.println("GAGNÉ !!");
                return;
            }
 
            // Choix du tamagotchi à nourrir (ceux qui n'ont pas fini)
            for (int i = 0; i < n; i++) {
                if (!colonie[i].ageLimite()) {
                    System.out.println("(" + i + ") " + colonie[i].getNom());
                }
            }
            int choix = -1;
            while (true) {
                System.out.print("Nourrir quel tamagotchi ? ");
                try {
                    choix = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    choix = -1;
                }
                if (choix >= 0 && choix < n && !colonie[choix].ageLimite()) {
                    break;
                }
                System.out.println("Choix invalide.");
            }
            colonie[choix].manger();
        }
    }
}
 