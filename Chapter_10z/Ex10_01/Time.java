import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time()
    {
        this(System.currentTimeMillis());
    }

    public Time(long milliseconds)
    {
        Instant instant =Instant.ofEpochMilli(milliseconds);
        LocalDateTime time = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
    }

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString()
    {
        return hour + ":" + minute + ":" + second;
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public void setTime(long elapseTime)
    {
        Instant instant = Instant.ofEpochMilli(elapseTime);
        LocalDateTime time = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
    }
}
