package arraylist;

import java.util.Objects;

public class Room {
    //房间编号
    private  int num ;
    //房间种类
    private  String type;
    //房间状态
    //true 为被预定
    private  boolean status;

    public Room() {
    }
    public Room(int num, String type, boolean status) {
        this.num = num;
        this.type = type;
        this.status = status;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //idea对boolean类型的变量，生成的get方法名为is
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return num == room.num &&
                status == room.status &&
                Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, type, status);
    }

    @Override
    public String toString() {
        return "Room{" +
                "num=" + num +
                ", type='" + type + '\'' +
                ", status=" + (status?"空闲" : "占用") +
                "}";
    }
}
