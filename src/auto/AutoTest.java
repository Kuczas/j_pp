public class AutoTest {
    public static void speedTest( Auto wichCar ){
        System.out.println("Start speed " + wichCar.getSpeed() );
        System.out.println("I'm getting faster baby");
        wichCar.moveFaster(50);
        System.out.println("Current speed: " + wichCar.getSpeed() );
        System.out.println("I will slow down 30 km/h");
        wichCar.moveMoreSlowly(30);
        System.out.println("Actual speed: " + wichCar.getSpeed() );
        System.out.println("Stop the car");
        wichCar.stopMoving();
        System.out.println("Speed after stop test: " + wichCar.getSpeed() );
    }
}