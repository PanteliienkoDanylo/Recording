package ua.epam.project1.model;


import java.util.Arrays;

public class Disk {

    /**
     * Final disk with tracks
     */
    public static final Disk DISK = new Disk(new Track[] {
            new Track(MusicStyle.ROCK, 355, "Nirvana", "Come as you are"),
            new Track(MusicStyle.ROCK, 289, "AC/DC", "Highway to hell"),
            new Track(MusicStyle.JAZZ, 314, "Ray Charles", "Georgia on my mind"),
            new Track(MusicStyle.JAZZ, 566, "Miles Davis", "Bag's Groove"),
            new Track(MusicStyle.ROCK, 263, "Kiss", "Hell or Hallelujah"),
            new Track(MusicStyle.ROCK, 248, "Linkin Park", "My December"),
            new Track(MusicStyle.ROCK, 321, "Red Hot Chili Peppers", "Californication"),
            new Track(MusicStyle.PUNK, 454, "Willie Nelson", "On the road again"),
            new Track(MusicStyle.PUNK, 393, "The Casualties", "We are all we have")});


    /**
     * Array of track
     */
    private Track[] disk;

    /**
     * Constructor
     *
     * Constructs disk object with given tracks
     * @param disk array of track
     */
    public Disk(Track[] disk){
        this.disk = disk;
    }

    /**
     * Constructor
     *
     * Default constructor
     */
    public Disk(){

    }

    /**
     * Get array of track
     * @return array of track
     */
    public Track[] getDisk() {
        return disk;
    }

    /**
     * Set array of track
     * @param disk
     */
    public void setDisk(Track[] disk) {
        this.disk = disk;
    }

    /**
     * Gets length of all tracks on the disk
     * @return length of all tracks on the disk
     */
    public int getDiskLength(){
        int diskLength = 0;
        for(Track track : DISK.getDisk()){
            diskLength += track.getDuration();
        }
        return diskLength;
    }

    /**
     * Find and return disk which length fits in given range
     * @param minValue min value of given range
     * @param maxValue max value of given range
     * @return array of sounds which length fits in given range
     */
    public Disk findTracksByLength(int minValue, int maxValue){
        int nullCount = 0;
        int count = 0;
        Disk temp = new Disk(new Track[DISK.getDisk().length]);
        for(Track track : DISK.getDisk()){
            if(track.getDuration() >= minValue && track.getDuration() <= maxValue){
                temp.getDisk()[count++] = track;
            }
        }
        for(Track track : temp.getDisk()){
            if(track != null){
                nullCount++;
            }
        }
        Disk temp2 = new Disk(new Track[nullCount]);
        for(int i = 0; i < nullCount; i++){
            temp2.getDisk()[i] = temp.getDisk()[i];
        }
        return temp2;
    }

    /**
     * Sort disk by style by alphabet
     */
    public Disk sortDiskByStyle(){
        int count = 0;
        Disk temp = new Disk(new Track[DISK.getDisk().length]);
        for(Track track : DISK.getDisk()){
            if(MusicStyle.JAZZ == track.getStyle()){
                temp.getDisk()[count++] = track;
            }
        }
        for(Track track : DISK.getDisk()){
            if(MusicStyle.PUNK == track.getStyle()){
                temp.getDisk()[count++] = track;
            }
        }
        for(Track track : DISK.getDisk()){
            if(MusicStyle.ROCK == track.getStyle()){
                temp.getDisk()[count++] = track;
            }
        }

        return temp;
    }

    /**
     * Returns a string representation of disk
     * @return returns a string representation of disk
     */
    @Override
    public String toString() {
        return disk.toString();
    }

    /**
     * Redefined method equals
     * @param o the reference object with which to compare
     * @return {@code true} if this object is the same as the obj
     *          argument; {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disk disk1 = (Disk) o;

        if (!Arrays.equals(disk, disk1.disk)) return false;

        return true;
    }


    /**
     * Redefined method hashCode
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return disk != null ? Arrays.hashCode(disk) : 0;
    }
}
