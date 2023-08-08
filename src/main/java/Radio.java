public class Radio {
    private int countStation = 10;
    private int currentStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > countStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToNextStation() {
        currentStation = currentStation + 1;
        if (currentStation >= countStation) {
            currentStation = 0;
        }

    }

    public void setToPrevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = countStation - 1;
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