package lab3;

public class OctoNumber implements myObserver{
    private number n;

    public OctoNumber( number in ) {
        this.n = in;
        n.addObserver( this );
    }

    public void update() {
        System.out.print("\nInteger value in Octodecimal is ");
        System.out.print(" " + Integer.toOctalString(n.getValue() ) );
    }
}
