package ru.netology.radio;
public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public void nextRadioStation() {
        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > 9) {
            currentRadioStation = 0;

        }

    }

    public void prevRadioStation() {
        currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < 0) {
            currentRadioStation = 9;

        }

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        currentVolume = currentVolume + 1;
        if (currentVolume > 100) {
            currentVolume =100;

        }
    }

    public void reduceVolume() {
        currentVolume = currentVolume - 1;
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}






