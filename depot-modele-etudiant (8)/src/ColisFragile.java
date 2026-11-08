public class ColisFragile extends Colis {
    private double valeurDeclaree;

    public ColisFragile(String code, double poids, boolean prioritaire, double valeurDeclaree) {
        super(code, poids, prioritaire);
        this.valeurDeclaree = valeurDeclaree;
    }

    @Override
    public double calculerFrais() {
        return poids * 1000 + valeurDeclaree * 0.05;
    }

    public double getValeurDeclaree() {
        return valeurDeclaree;
    }
}