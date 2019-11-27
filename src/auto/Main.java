import java.util.ArrayList;
import java.util.List;
public class Main {
    private static List< Auto > carList = new ArrayList<>();
    public static void main(String[] args) {
        Auto tesla = new Auto();
        Auto fiat125p = new Auto( "fiat", "125p" );
        carList.add( new Auto("lamborghini", "aventador" ) );
        carList.add( fiat125p );
        carList.add( tesla ) ;
        for( Auto a : carList ) {
            System.out.println( "Auto marki: " + a.getBrand() + " model " + a.getModel() );
            AutoTest.speedTest(a);
            System.out.println("<<===========================>>");
        }
    }
}