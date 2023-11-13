public class Time {

    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds){
        validate(hour, minutes, seconds);

      this.hour = hour;
      this.minutes = minutes;
      this.seconds = seconds;

    }

    public void setHour(int hour){
        validateSeconds(seconds);
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;

    }


    private static void validate(int hour, int minutes, int seconds){
        validateHour(hour);
        validateMinutes(minutes);
        validateSeconds(seconds);

    }

    private static void validateSeconds(int seconds){
        boolean secondsIsInvalid = seconds > 59 || seconds < 0;
        if (secondsIsInvalid) throw new IllegalArgumentException("Seconds is Invalid!");

    }
    private static void validateMinutes(int minutes){
        boolean minutesIsInvalid = minutes > 59 || minutes < 0;
        if (minutesIsInvalid) throw new IllegalArgumentException("Minutes is Invalid!");

    }
    private static void validateHour(int hour){
        boolean hourIsInvalid = hour > 23 || hour < 0;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is Invalid!");

    }
    public int getHour(){
        return hour;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }


}
