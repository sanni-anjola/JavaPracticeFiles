package africa.semicolon.chapterThreeExercises;

public class AirConditioner {


    private String productName;
    private boolean isOn;
    private int temperature;
    private final int LOWEST_TEMPERATURE = 16;
    private final int HIGHEST_TEMPERATURE = 30;

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

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void increaseTemperature() {
        if(this.isOn() && this.temperature < HIGHEST_TEMPERATURE){
            this.temperature++;
        }
    }

    public void decreaseTemperature() {
        if(this.isOn() && this.temperature > LOWEST_TEMPERATURE){
            this.temperature--;
        }
    }

    public int getTemperature() {
        return this.temperature;
    }
}
