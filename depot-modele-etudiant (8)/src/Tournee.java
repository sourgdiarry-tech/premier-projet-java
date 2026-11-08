public class Tournee {
    public static void main(String[] args) {
        Colis[] lot = {
            new ColisStandard("CB1", 4, false),
            new ColisExpress("CB2", 3, true),
            new ColisFragile("CB3", 5, false, 120_000),
            new ColisExpress("CB4", 7, true)
        };

        double total = 0;
        for (Colis c : lot) {
            c.afficher();
            total = total + c.calculerFrais();

            if (c instanceof ColisFragile) {
                ColisFragile f = (ColisFragile) c;
                System.out.println("Fragile, valeur declaree : " + f.getValeurDeclaree());
            }
        }
        System.out.println("Total frais : " + total);
    }
}