package africa.semicolon.chapterThreeExercises;

public class Television {
    private String productName;
    private boolean isOn;
    private int channel;
    private int volume;

    public Television(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;

    }

    public boolean isOn() {
        return isOn;
    }

    public void setChannel(int channel) {
        if(isOn && channel >= 0 && channel <= 9) {
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void changeChannelAscend() {
        if(isOn) {
            channel = (channel + 1) % 10;
        }
    }

    public void changeChannelDescend() {
        if(isOn) {
            channel = (channel + 9) % 10;
        }
    }

    public void setVolume(int volume) {
        if(isOn && volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(isOn && volume >= 0 && volume < 100){
            volume++;
        }
    }

    public void decreaseVolume() {
        if(isOn && volume > 0 && volume <= 100){
            volume--;
        }
    }
}
