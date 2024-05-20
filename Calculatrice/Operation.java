public abstract class Operation {
    private int operande1;
    private int operande2;

    // Constructeur pour initialiser les opérandes
    public Operation(int operande1, int operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    // Méthode pour retourner la valeur de l'opération (à définir dans les classes d'opérations)
    public abstract int valeur();

    // Méthode pour retourner le premier opérande
    public int getOperande1() {
        return this.operande1;
    }

    // Méthode pour retourner le deuxième opérande
    public int getOperande2() {
        return this.operande2;
    }
}
