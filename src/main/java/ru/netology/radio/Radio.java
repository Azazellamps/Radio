package ru.netology.radio;


public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberOfRadioStations;



    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }


    public void nextRadioStation() {
        if (currentRadioStation < numberOfRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;

    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = numberOfRadioStations - 1;
    }


    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > numberOfRadioStations - 1) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

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
        if (currentVolume >= 100) {
            currentVolume = 100;

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

