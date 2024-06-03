public class Nombre extends Expression {
    private int valeurNombre;

    // Constructeur pour initialiser une valeur

    public Nombre(int valeur) {
        this.valeurNombre = valeur;
    }

    // Méthode pour retourner la valeur d'un nombre
    @Override
    public double valeur() {
        return this.valeurNombre;
    }

    // Remplacement de la méthode toString pour afficher la valeur du nombre
    @Override
    public String toString() {
        return String.valueOf(this.valeurNombre);
    }    
}
