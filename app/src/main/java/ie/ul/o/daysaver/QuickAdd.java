package ie.ul.o.daysaver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Ali on 17/04/2018.
 */

public class QuickAdd {
    private String id="QUICKADD";
    private String title="Untitled_"+new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault()).format(System.currentTimeMillis());
    private String description="";
    private long startTime;
    private long endTime;
    private String date;
    private long startAt,endAt;

    public QuickAdd() {

    }

    public void setStartAt(long startAt) {
        this.startAt = startAt;
    }

    public long getEndAt() {
        return endAt;
    }

    public void setEndAt(long endAt) {
        this.endAt = endAt;
    }

    public QuickAdd(String id, String title, String description, long startTime, long endTime, String date) {
        this.id = "QUICKADD";
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        try {
            startAt=(new SimpleDateFormat("dd/MM/yyyy").parse(date).getTime()+startTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            endAt=(new SimpleDateFormat("dd/MM/yyyy").parse(date).getTime()+endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        description="Title: "+title+
                "\nDate: "+date+
                "\nStart Time: "+startTime+
                "\nEnd Time: "+endTime;
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "description " + description;

    }

    public long getStartAt() {
        return startAt;
    }
}
