package africa.semicolon.ch2;

public class AirConditioner{

    private boolean isOn;
    private String productName;
    private int temperature;
    
    public AirConditioner(String productName){
        this.productName = productName;
    }
    
    public void decreaseTmperature(int temp){
        this.temperature = this.temperature - temp;
    }
    
    public String getProductName(){
        return this.productName;
    }
    
    public int getTemperature(){
        return this.temperature;
    }
    
    public void increaseTmperature(int temp){
        this.temperature = this.temperature + temp;
    }
    
    public boolean isOn(){
        return this.isOn;
    }
    
    public void setOn(boolean isOn){
        this.isOn = isOn;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    
}
