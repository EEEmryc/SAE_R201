public class Division extends Operation {

    // Constructeur pour initialiser les opérandes
    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }
    
    // Méthode pour retourner le résultat de la division entre les deux opérandes
    @Override
    public double valeur() {
        if (getOperande2().valeur() == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return getOperande1().valeur() / getOperande2().valeur();
    }

    // Remplacement de la toString par défaut pour la division
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
        return expression1 + " / " + expression2;
    }
}
