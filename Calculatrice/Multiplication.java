public class Multiplication extends Operation {
    private Nombre operande1;
    private Nombre operande2;

    // Constructeur pour initialiser les opérandes
    public Multiplication(Nombre operande1, Nombre operande2) {
        super(operande1.valeur(), operande2.valeur());
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    // Méthode pour retourner le résultat de la multiplication entre les deux opérandes
    @Override
    public int valeur() {
        return operande1.valeur() * operande2.valeur();
    }

    //Remplacement de la toString par défaut pour la multiplication
    @Override
    public String toString() {
        return "(" + operande1.valeur() + " x " + operande2.valeur() + ")";
    }
}

