public class ColisStandard extends Colis {
    public ColisStandard(String code, double poids, boolean prioritaire) {
        super(code, poids, prioritaire);
    }
    @Override
    public double calculerFrais() {
        return poids * 1000;
    }
}