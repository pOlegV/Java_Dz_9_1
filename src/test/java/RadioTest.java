import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "8,8", "9,9", "-1,0", "10,0"})
    public void shouldSetStation(int inStation, int expected){
        Radio radio = new Radio();
        radio.setCurrentStation(inStation);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"0,1", "1,2", "8,9", "9,0", "-1,1", "10,1"})
    public void shouldNextStation (int inStation, int expected){
        Radio radio = new Radio();
        radio.setCurrentStation(inStation);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"0,9", "1,0", "8,7", "9,8", "-1,9", "10,9"})
    public void shouldPrevStation (int inStation, int expected){
        Radio radio = new Radio();
        radio.setCurrentStation(inStation);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "9,9", "10,10", "-1,0", "11,0"})
    public void shouldSetVolume(int inVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(inVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"0,1", "1,2", "9,10", "10,10", "-1,1", "11,1"})
    public void shouldIncreaseVolume(int inVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(inVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({"0,0", "1,0", "9,8", "10,9", "-1,0", "11,0"})
    public void shouldDecreaseVolume(int inVolume, int expected){
        Radio radio = new Radio();
        radio.setCurrentVolume(inVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
