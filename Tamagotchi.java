import java.util.Random;

public class Tamagotchi {
    private static final Random RND = new Random();

    private int age;
    private int dureeDeVie;
    private int maxEnergie;
    private int energie;
    private String nom;

    public Tamagotchi(String nom) {
        this.nom = nom;
        this.age = 0;
        this.dureeDeVie = 9 + RND.nextInt(6);                 // 9 à 14
        this.maxEnergie = 5 + RND.nextInt(5);                 // 5 à 9
        this.energie = 3 + RND.nextInt(maxEnergie - 3 + 1);   // 3 à maxEnergie
    }

    public String getNom() {
        return nom;
    }

    public void parler() {
        if (energie > 5) {
            System.out.println(nom + " : tout va bien !");
        } else {
            System.out.println(nom + " : je suis affamé !");
        }
    }

    public void manger() {
        if (energie >= maxEnergie) {
            System.out.println(nom + " : je n'ai pas faim !!");
        } else {
            energie += 1 + RND.nextInt(3);                    // 1 à 3
            if (energie > maxEnergie) {
                energie = maxEnergie;                         // on ne dépasse pas le max
            }
            System.out.println(nom + " : Merci !");
        }
    }

    public boolean ageLimite() {
        return age >= dureeDeVie;
    }

    public boolean vivre() {
        if (age == dureeDeVie) {                              // cas (a)
            return true;
        }
        if (energie <= 0) {                                   // cas (b)
            System.out.println(nom + " : je meurs... Arrrggh !");
            return false;
        }
        age++;                                                // cas (c)
        energie--;
        if (ageLimite()) {
            System.out.println(nom + " : c'est gagné pour moi !");
        } else {
            parler();
        }
        return true;
    }
}