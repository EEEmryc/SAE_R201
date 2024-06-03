public class CalculatriceSimple {
    public static void main(String[] args) {
        //Test Addition

        Nombre a1 = new Nombre(6);
        Nombre a2 = new Nombre(10);
        Operation a = new Addition(a1, a2);
        System.out.println(a+ "="+a.valeur());

        Nombre a3 = new Nombre(34);
        Nombre a4 = new Nombre(10);
        Operation b = new Addition(a3, a4);
        System.out.println(b+ "="+b.valeur());

        //Test Soustraction

        Nombre six = new Nombre(12);
        Nombre dix = new Nombre(0);
        Operation c = new Soustraction(dix, six);
        System.out.println(c+ "="+c.valeur());

        Nombre s1 = new Nombre(2);
        Nombre s2 = new Nombre(114);
        Operation d = new Soustraction(s1, s2);
        System.out.println(d+ "="+d.valeur());

        //Test Multiplication

        Nombre m1 = new Nombre(2);
        Nombre m2 = new Nombre(10);
        Operation e = new Multiplication(m1, m2);
        System.out.println(e+ "="+e.valeur());
        
        Nombre m3 = new Nombre(5);
        Nombre m4 = new Nombre(0);
        Operation f = new Multiplication(m3, m4);
        System.out.println(f+ "="+f.valeur());

        //Test Division

        Nombre d1 = new Nombre(2);
        Nombre d2 = new Nombre(10);
        Operation g = new Division(d1, d2);
        System.out.println(g+ "="+g.valeur());

        Nombre d3 = new Nombre(5);
        Nombre d4 = new Nombre(0);
        Operation h = new Division(d3, d4);
        System.out.println(h+ "="+h.valeur());
    }
}
