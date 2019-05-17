import java.io.*;

public class WeeklyLogDeepClone implements Serializable {

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

    //克隆方法：使用序列化技术实现深克隆
    public WeeklyLogDeepClone deepClone() throws IOException, ClassNotFoundException {

        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLogDeepClone) ois.readObject();

    }

    public static void main(String[] args) {
        WeeklyLogDeepClone weeklyLog_Previous = new WeeklyLogDeepClone();
        Attachment attachment = new Attachment();
        weeklyLog_Previous.setName("lth");
        weeklyLog_Previous.setDate("2019-0101");
        weeklyLog_Previous.setContent("busy");
        weeklyLog_Previous.setAttachment(attachment);

        WeeklyLogDeepClone weeklyLog_new = null;
        try {

            weeklyLog_new = weeklyLog_Previous.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        weeklyLog_new.setDate("20190102");
        System.out.println(weeklyLog_new.content);
        System.out.println(weeklyLog_Previous == weeklyLog_new);
        System.out.println(weeklyLog_Previous.content == weeklyLog_new.content);
        System.out.println(weeklyLog_Previous.date == weeklyLog_new.date);
        System.out.println(weeklyLog_Previous.name == weeklyLog_new.name);
        System.out.println(weeklyLog_Previous.attachment == weeklyLog_new.attachment);


    }
}

