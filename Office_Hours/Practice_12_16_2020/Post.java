package Office_Hours.Practice_12_16_2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

    private String body;
    private final String dateTime;

    public Post(String body) {
        this.body = body;

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
        this.dateTime = dateTime.format(format);

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }

}
