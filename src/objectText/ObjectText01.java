package objectText;
//关于object的方法
public class ObjectText01 {
    //类名@对象的内存地址的16制形式
    //tostring的作用是把一个java对象转换成字符串转换形式
    //sun公司的时候建议所有的子类重写tostring方法
    public static void main(String[] args) {
        Do aDo = new Do(2020,9,16);
        String s = aDo.toString();
        System.out.println(s);
        //输出的为一个带地址的字符串形式，无法的出具体的年月日数值，所以重写tostring方法
      // 默认使用println 调用了tostring方法

    }
}
class Do {
    int year;
    int month;
    int day;

    public Do() {
    }
    public Do(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Do{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}