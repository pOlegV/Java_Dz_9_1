public class Radio {
    private int currentStation = 10;
    private int maxCurrentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.maxCurrentStation = currentStation - 1;
    }

    public Radio(int currentStation) {
        this.currentStation = currentStation;
        this.maxCurrentStation = currentStation - 1;
    }

    public void setCurrentStation(int station) {
        if (station < 0) {
            return;
        } else if (station > maxCurrentStation) {
            return;
        } else {
            currentStation = station;
        }
    }

    public int getCurrentStation() {
        if (currentStation < 0) {
            return 0;
        } else if (currentStation > maxCurrentStation) {
            return 0;
        } else {
            return currentStation;
        }
    }

    public void nextStation() {
        if (currentStation == maxCurrentStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxCurrentStation;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume < minVolume) {
            return;
        } else if (volume > maxVolume) {
            return;
        } else {
            currentVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}
