package Ex1;

public class GravityCalculator {
    static final double GRAVITY = -9.8;


    public static void main(String[] Args){
        int fallingTime;
        double initialPosition;
        double initialVelocity;


        if(System.getenv("fallingTime")==null) {
             fallingTime = 0;
        }else {
            fallingTime = Integer.parseInt(System.getenv("fallingTime"));
        }

        if(System.getenv("initialPosition")==null) {
            initialPosition = 0;
        }else {
            initialPosition = Double.parseDouble(System.getenv("initialPosition"));
        }

        if(System.getenv("initialVelocity")==null) {
            initialVelocity = 0;
        }else {
            initialVelocity = Double.parseDouble(System.getenv("initialVelocity"));
        }

        var calc= new GravityCalculator();

        System.out.println("Position in " + fallingTime + " seconds: " + calc.CalculatePosition(fallingTime, initialVelocity, initialPosition));
    }

    public double CalculatePosition(int fallingTime, double initialVelocity, double initialPosition){
        return  (fallingTime * fallingTime) * GRAVITY * 0.5 + (initialVelocity * fallingTime) + initialPosition;
    }

}
