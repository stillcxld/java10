public class Radio {
    private int currentStation;
    private int currentVolume;

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
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {   //сеттер для громкости сделан только для тестов
        currentVolume = newCurrentVolume;                   //данный функицонал не предусмотрен в продукте
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        if (currentStation < 9) {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
