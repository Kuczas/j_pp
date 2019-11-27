public class Auto {
    private int speed = 0;
    private String brand;
    private String model;
    public Auto(){
        brand = "Tesla";
        model = "S";
    }
    Auto( String brand, String model ){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void moveFaster( int howFaster ){
        // speed = speed + howFaster;
        speed += howFaster;
    }
    public void moveMoreSlowly( int howSlowly){
        // speed = speed - howSlowly;
        speed -= howSlowly;
    }
    public void stopMoving(){
        speed = 0;
    }
    public int getSpeed(){
        return speed;
    }
}