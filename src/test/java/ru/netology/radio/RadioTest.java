package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void currentRadioStationMax() {
        Radio set = new Radio();
        set.setCurrentRadioStation(10);

        int actual = set.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationMin() {
        Radio set = new Radio();
        set.setCurrentRadioStation(-1);
        int actual = set.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio next = new Radio();

        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();
        next.nextRadioStation();

        int expected = 0;
        int actual = next.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadioStation() {
        Radio prev = new Radio();
        prev.prevRadioStation();
        prev.prevRadioStation();
        prev.prevRadioStation();


        int expected = 7;
        int actual = prev.getCurrentRadioStation();

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