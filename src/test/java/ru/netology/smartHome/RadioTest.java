package ru.netology.smartHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void stationLimMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationLimMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.nextStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationNextTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationPrevious() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationPreviousTwo() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInput() {
        Radio radio = new Radio();
        int currentStation = 7;
        int expected = 7;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInputTwo() {
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInputTree() {
        Radio radio = new Radio();
        int currentStation = 10;
        int expected = 0;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeUp();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeUpTwo() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.volumeUp();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeDownTwo() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        rad.volumeDown();
        int expected = 7;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
