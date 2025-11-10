public class TestA {
    public static void main(String[] args) {
        A u = new A(1);//crée un objet A avec x = 1
        System.out.println(u.f());//appelle f() → 1 + 3 = 4, affiche : 4

        A v = new A(4);//crée un objet A avec x = 4.
        System.out.println(v.f());//appelle f() → 4 + 3 = 7, affiche:7
    
        A w = u.g(v);//Execute
    }
}