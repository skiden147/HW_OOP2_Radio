public class Radio {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {

        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > 9) {
            newCurrentChannel = 0;
        }
        if (newCurrentChannel < 0) {
            newCurrentChannel = 9;
        }
        currentChannel = newCurrentChannel;
    }

    public void setToNextChannel() {
        currentChannel = currentChannel + 1;
        if (currentChannel > 9) {
            currentChannel = 0;
        }

    }

    public void setToPrevChannel() {
        currentChannel = currentChannel - 1;
        if (currentChannel < 0) {
            currentChannel = 9;
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