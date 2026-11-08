public class ColisExpress extends Colis {
    public ColisExpress(String code, double poids, boolean prioritaire) {
        super(code, poids, prioritaire);
    }
    @Override
    public double calculerFrais() {
        return poids * 2000 + 3000;
    }
}