public class Division extends Operation {
    private Nombre operande1;
    private Nombre operande2;

    // Constructeur pour initialiser les opérandes
    public Division(Nombre operande1, Nombre operande2) {
        super(operande1.valeur(), operande2.valeur());
        this.operande1 = operande1;
        this.operande2 = operande2;
        
        if (operande2.valeur() == 0) {
            throw new IllegalArgumentException("Diviser par 0 est impossible, veuillez changer de dénominateur");
        }
    }
    // Méthode pour retourner le résultat de la division entre les deux opérandes
    @Override
    public int valeur() {
        try {
            return operande1.valeur() / operande2.valeur();
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    //Remplacement de la toString par défaut pour la division
    @Override
    public String toString() {
        return "(" + operande1.valeur() + " / " + operande2.valeur() + ")";
    }
}
