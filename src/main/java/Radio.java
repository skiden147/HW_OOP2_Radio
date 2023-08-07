public class Radio {
    private int maxChannel = 10;
    private int minChannel = 0;
    private int currentChannel = minChannel;
    private int currentVolume;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public Radio() {

    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > maxChannel) {
            return;
        }
        if (newCurrentChannel < minChannel) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void setToNextChannel() {
        currentChannel = currentChannel + 1;
        if (currentChannel >= maxChannel) {
            currentChannel = minChannel;
        }

    }

    public void setToPrevChannel() {
        currentChannel = currentChannel - 1;
        if (currentChannel < minChannel) {
            currentChannel = maxChannel - 1;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}