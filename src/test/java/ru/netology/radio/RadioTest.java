package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationEquallyMax() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(11);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationHigherMax() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioStationNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highVolume() {
        Radio high = new Radio();

        high.increaseVolume();
        high.increaseVolume();
        high.increaseVolume();

        int actual = high.getCurrentVolume();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction() {
        Radio red = new Radio();
        red.reduceVolume();

        int actual = red.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMax() {
        Radio max = new Radio();
        max.setCurrentVolume(100);
        max.increaseVolume();
        max.increaseVolume();
        max.increaseVolume();

        int actual = max.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMin() {
        Radio min = new Radio();
        min.setCurrentVolume(0);
        min.reduceVolume();

        int actual = min.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMin() {
        Radio min = new Radio();
        min.setCurrentVolume(5);
        min.reduceVolume();

        int actual = min.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }
}