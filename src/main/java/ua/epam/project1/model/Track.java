package ua.epam.project1.model;


public class Track {

    /**
     * Constanta
     * Least two digital number
     */
    private static final int LEAST_TWO_DIGITAL_NUMBER = 10;

    /**
     * Constanta
     * Seconds if minute
     */
    private static final int SECONDS_IN_MINUTE = 60;

    /**
     * Constanta
     * Seconds in hour
     */
    private static final int SECONDS_IN_HOUR = 3600;

    /**
     * Style of track
     */
    private MusicStyle style;
    /**
     * Duration of track in seconds
     */
    private int duration;

    /**
     * Performer of track
     */
    private String performer;
    /**
     * Name of track
     */
    private String name;

    /**
     * Constructor
     *
     * Constructs tracks object with given parameters
     * @param style style of track
     * @param duration duration of track
     * @param performer performer of track
     * @param name name of track
     */
    public Track(MusicStyle style, int duration, String performer, String name) {
        this.style = style;
        this.duration = duration;
        this.performer = performer;
        this.name = name;
    }

    /**
     * Get style of track
     * @return style of track
     */
    public MusicStyle getStyle() {
        return style;
    }

    /**
     * Set style of track
     * @param style style of track
     */
    public void setStyle(MusicStyle style) {
        this.style = style;
    }

    /**
     * Get performer of track
     * @return performer of track
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * Set performer of track
     * @param performer performer of track
     */
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    /**
     * Get name of track
     * @return name of track
     */
    public String getName() {
        return name;
    }


    /**
     * Set name of track
     * @param name name of track
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get duration of track (in seconds)
     * @return duration of track
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Set duration of track (in seconds)
     * @param duration duration of track
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Get only minutes of duration
     * @return only minutes of duration
     */
    public int getMinute(){
        return duration / SECONDS_IN_MINUTE;
    }

    /**
     * Get only seconds of duration
     * @return only seconds of duration
     */
    public int getSecond(){
        return duration - getMinute() * SECONDS_IN_MINUTE;
    }

    /**
     * Get only hour of duration
     * @return only hour of duration
     */
    public int getHour(){
        return duration / SECONDS_IN_HOUR;
    }

    /**
     * If seconds of duration < 10 return seconds in string, else return string "0" + seconds in string
     * @return seconds in string
     */
    public String second(){
        int second = getSecond();
        if(second < LEAST_TWO_DIGITAL_NUMBER){
            return "0" + second;
        }
        return "" + second;
    }

    /**
     * If minutes duration < 10 return seconds in string, else return string "0" + seconds in string
     * @return minutes in string
     */
    public String minute(){
        int minute = getMinute();
        if(minute < LEAST_TWO_DIGITAL_NUMBER){
            return "0" + minute;
        }
        return "" + minute;
    }

    /**
     * Returns a string representation of track
     * @return a string representation of track
     */
    @Override
    public String toString() {
        return
                style.toString() + " : \t "  + getHour() + ":" + minute() + ":" + second() +
                        "(" + duration + ")" +"\t" + "\""  + performer + " - " + name  + "\""  + "\n";
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

        Track track = (Track) o;

        if (duration != track.duration) return false;
        if (name != null ? !name.equals(track.name) : track.name != null) return false;
        if (performer != null ? !performer.equals(track.performer) : track.performer != null) return false;
        if (style != track.style) return false;

        return true;
    }

    /**
     * Redefined method hashCode
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        int result = style != null ? style.hashCode() : 0;
        result = 31 * result + duration;
        result = 31 * result + (performer != null ? performer.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
