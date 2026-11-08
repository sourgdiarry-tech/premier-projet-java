public abstract class Colis {
    protected String code;
    protected double poids;
    protected boolean prioritaire;

    public Colis(String code, double poids, boolean prioritaire) {
        this.code = code;
        this.poids = poids;
        this.prioritaire = prioritaire;
    }

    public String getCode() { return code; }
    public double getPoids() { return poids; }
    public boolean isPrioritaire() { return prioritaire; }

    public abstract double calculerFrais();

    public void afficher() {
        System.out.println(code + " - " + poids + " kg - prioritaire: " + prioritaire + " - frais: " + calculerFrais());
    }
}