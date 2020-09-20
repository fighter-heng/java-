package objectText;

import java.util.Objects;

public class ObjectText02 {
    //equals方法判断两个对象是否相等
    public static void main(String[] args) {
         Dod aDo = new Dod(2020,1,1);
         Dod aDo1 = new Dod(2020,1,1);
        System.out.println(aDo==aDo1);
        //双等号比较的是两个对象的内存地址
        System.out.println(aDo);
        System.out.println(aDo1);
        boolean equals = aDo.equals(aDo1);
        System.out.println(aDo.equals(aDo1));
        //equals中默认使用的是双等号，要比较内容必须重写equals方法
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }

//string类型底层已经重写了equals方法
        //string的底层同样重写了tostring方法
    }


}
class Dod {
    int year;
    int month;
    int day;
    public Dod() {
    }
    public Dod(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //不能用obj.year比较因为object类中没有year属性
//    public boolean equals(Object obj) {//不能改变object obj
//        if(obj==null){
//            return false;
//        }
//        if (!(obj instanceof Dod)){
//            return false;
//        }
//        if(this==obj){
//            return true;
//        }
//        if (obj instanceof Dod){
//            int b=  this.year;
//            int a=    ((Dod)obj).year;
//            int d =this.day;
//            int c=((Dod)obj).day;
//            int f =  this.month;
//            int e =((Dod)obj).month;
////程序有bug当传一个空值返回false(只考虑当前的if语句）
//            if ((b==a)&&(c==d)&&(e==f) ){
//                return true;
//            }
//        }
//       return false;
//    }
//引用类型一定要使用equals方法，重写equals方法一定要彻底。

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dod dod = (Dod) o;
        return year == dod.year &&
                month == dod.month &&
                day == dod.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}