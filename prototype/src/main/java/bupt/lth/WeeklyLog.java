import java.io.Serializable;

public class WeeklyLog implements Cloneable {

    private String name;
    private String date;
    private String content;
    private Attachment attachment;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    //克隆方法：实现浅克隆
    public WeeklyLog clone(){

        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (WeeklyLog) object;

    }

    public static void main(String[] args) {
        WeeklyLog weeklyLog_Previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        weeklyLog_Previous.setName("lth");
        weeklyLog_Previous.setDate("2019-0101");
        weeklyLog_Previous.setContent("busy");
        weeklyLog_Previous.setAttachment(attachment);

        WeeklyLog weeklyLog_new;
        weeklyLog_new = weeklyLog_Previous.clone();
        weeklyLog_new.setDate("20190102");
        System.out.println(weeklyLog_new.content);
        System.out.println(weeklyLog_Previous == weeklyLog_new);
        System.out.println(weeklyLog_Previous.content == weeklyLog_new.content);
        System.out.println(weeklyLog_Previous.date == weeklyLog_new.date);
        System.out.println(weeklyLog_Previous.name == weeklyLog_new.name);
        System.out.println(weeklyLog_Previous.attachment == weeklyLog_new.attachment);


    }
}
