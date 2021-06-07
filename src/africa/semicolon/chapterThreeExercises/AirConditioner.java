package africa.semicolon.chapterThreeExercises;

public class AirConditioner {


    private final String productName;
    private boolean isOn;
    private int temperature;
    private final int LOWEST_TEMPERATURE = 16;

    public AirConditioner(String productName) {
        this.productName = productName;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
        this.temperature = LOWEST_TEMPERATURE;
    }

    public String getProductName() {
        return this.productName;
    }

    public void increaseTemperature() {
        int HIGHEST_TEMPERATURE = 30;
        if(isOn && this.temperature < HIGHEST_TEMPERATURE){
            this.temperature++;
        }
    }

    public void decreaseTemperature() {
        if(isOn && this.temperature > LOWEST_TEMPERATURE){
            this.temperature--;
        }
    }

    public int getTemperature() {
        return this.temperature;
    }
}
