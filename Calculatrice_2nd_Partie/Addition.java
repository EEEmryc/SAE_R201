public class Addition extends Operation {

    // Constructeur pour initialiser les opérandes
    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }
    
    // Méthode pour retourner le résultat de l'addition entre les deux opérandes
    @Override
    public double valeur() {
        return getOperande1().valeur() + getOperande2().valeur();
    }

    // Remplacement de la toString par défaut pour l'addition
    @Override
    public String toString() {
        String expression1 = getOperande1().toString();
        String expression2 = getOperande2().toString();
        // Ajout de parenthèses autour des expressions si nécessaire
        if (getOperande1() instanceof Operation) {
            expression1 = "(" + expression1 + ")";
        }
        if (getOperande2() instanceof Operation) {
            expression2 = "(" + expression2 + ")";
        }
        return expression1 + " + " + expression2;
    }
}
