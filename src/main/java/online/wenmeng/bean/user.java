package online.wenmeng.bean;

import java.util.Date;

/**
 * @Auther: 狼芒
 * @Date: 2021/3/14 3:49
 * @Descrintion:
 * @version: 1.0
 */
public class user {
    private int id;
    private String name;
    private Date time;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
