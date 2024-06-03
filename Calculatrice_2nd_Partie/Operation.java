public abstract class Operation extends Expression {
    private Expression operande1;
    private Expression operande2;

    // Constructeur pour initialiser les opérandes
    public Operation(Expression operande1, Expression operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    // Méthode pour retourner le premier opérande
    public Expression getOperande1() {
        return this.operande1;
    }

    // Méthode pour retourner le deuxième opérande
    public Expression getOperande2() {
        return this.operande2;
    }
}
