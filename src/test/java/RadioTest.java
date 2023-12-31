import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetChannel() {
        Radio rad = new Radio();

        rad.setCurrentChannel(7);

        int expected = 7;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(9);
        rad.setToNextChannel();

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(0);
        rad.setToPrevChannel();

        int expected = 9;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentChannel(11);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentChannel(-2);

        int expected = 9;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetToNextChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(15);
        rad.setToNextChannel();

        int expected = 1;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetToPrevChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(-15);
        rad.setToPrevChannel();

        int expected = 8;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}