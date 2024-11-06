package Oct.Practice.Class14102024_Absraction.RealEx2;

public class WagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }


    @Override
    void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping car");
    }
}
