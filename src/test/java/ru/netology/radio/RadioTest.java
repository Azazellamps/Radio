package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextRadioStation() {
        Radio radio= new Radio(11);
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationHigher() {
        Radio radio= new Radio(10);
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setRadioStation() {
        Radio radio= new Radio(10);
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setRadioStationHigher() {
        Radio radio= new Radio(10);
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNumberOfRadioStations() {
        Radio radio= new Radio(10);
        int expected = 10;
        int actual = radio.getNumberOfRadioStations();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioStation() {
        Radio radio= new Radio(10);
        radio.setCurrentRadioStation(5);

        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioStationMin() {
        Radio radio= new Radio(10);
        radio.setCurrentRadioStation(-1);

        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void highVolume() {
        Radio radio= new Radio(5);

        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction() {
        Radio radio= new Radio(5);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMax() {
        Radio radio= new Radio(10);
        radio.setCurrentVolume(100);
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMaxHigher() {
        Radio radio= new Radio(10);
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMin() {
        Radio radio= new Radio(5);
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMin() {
        Radio radio= new Radio(4);
        radio.setCurrentVolume(5);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }
}