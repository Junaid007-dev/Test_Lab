package lab3;

public class Radix3 implements myObserver{
    private number n;

    public Radix3( number in ) {
        this.n = in;
        n.addObserver( this );
    }

    public void update() {
        System.out.print("\nInteger value in Radix 3 is ");
        System.out.print(" " + Integer.toString(n.getValue(),3));
    }
}
