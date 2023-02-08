public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio(int stationAmount) {
        maxStation = stationAmount - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {   //сеттер для громкости сделан только для тестов
        currentVolume = newCurrentVolume;                   //данный функицонал не предусмотрен в продукте
    }

    public void nextStation() {
        if ((maxStation - 1) >= currentStation) {
            currentStation++;
        } else if ((maxStation) == currentStation) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else if (currentStation >= 1) {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}