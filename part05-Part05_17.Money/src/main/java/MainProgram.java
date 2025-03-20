
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money primero = new Money(10, 0);
        Money segundo = new Money(7, 40);
        
        Money tercero = primero.minus(segundo);
        System.out.println(tercero);
    }
}
