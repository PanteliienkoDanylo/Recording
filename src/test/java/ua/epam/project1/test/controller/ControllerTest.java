package ua.epam.project1.test.controller;

import org.junit.Test;
import ua.epam.project1.model.Disk;
import ua.epam.project1.model.MusicStyle;
import ua.epam.project1.model.Track;


import static org.junit.Assert.*;

public class ControllerTest {


    /**
     * Disk
     */
    Disk disk = new Disk();

    /**
     * Disk after sortDiskByStyle method
     */
    Disk sortDisk = new Disk(new Track[]{
            new Track(MusicStyle.JAZZ, 314, "Ray Charles", "Georgia on my mind"),
            new Track(MusicStyle.JAZZ, 566, "Miles Davis", "Bag's Groove"),
            new Track(MusicStyle.PUNK, 454, "Willie Nelson", "On the road again"),
            new Track(MusicStyle.PUNK, 393, "The Casualties", "We are all we have"),
            new Track(MusicStyle.ROCK, 355, "Nirvana", "Come as you are"),
            new Track(MusicStyle.ROCK, 289, "AC/DC", "Highway to hell"),
            new Track(MusicStyle.ROCK, 263, "Kiss", "Hell or Hallelujah"),
            new Track(MusicStyle.ROCK, 248, "Linkin Park", "My December"),
            new Track(MusicStyle.ROCK, 321, "Red Hot Chili Peppers", "Californication")});

    /**
     * Disk after findDiskByLength method with minValue = 100 and maxValue = 300
     */
    Disk findDisk = new Disk(new Track[]{
            new Track(MusicStyle.ROCK, 289, "AC/DC", "Highway to hell"),
            new Track(MusicStyle.ROCK, 263, "Kiss", "Hell or Hallelujah"),
            new Track(MusicStyle.ROCK, 248, "Linkin Park", "My December")});

    /**
     * Disk duration
     */
    Integer diskLength = 3203;

    /**
     * Test getDiskLength method
     */
    @Test
    public void getDiskLengthTest(){
        assertTrue(disk.getDiskLength() == diskLength);
    }

    /**
     * Test sortDiskByStyle method
     */
    @Test
    public void sortDiskByStyleTest(){
        assertTrue(disk.sortDiskByStyle().equals(sortDisk));
    }

    /**
     * Test findTrackByLength method
     */
    @Test
    public void findTracksByLengthTest(){
        assertTrue(disk.findTracksByLength(100, 300).equals(findDisk));
    }

}
