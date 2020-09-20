package InStance;

public class Text01 {
        public static void main(String[] args) {
          dorm dorm = new dorm();
              dorm.name="217宿舍";
         Student student1 = new Student();
         Student student2 = new Student();
         student2.setName("贾刘煜");
         student2.number="03182009";
         student2.age=21;
         student2.address="西安长安";
        dorm.student=student2;
        dorm.student.setName("常铭轩");
        System.out.println(dorm.name);
        dorm.student.age=23;
        dorm.student.number="03182008";
        dorm.student.address="西安商洛";
        Student.nationality="中国";
        System.out.println(dorm.student.getName());
        System.out.println(dorm.student.age);
        System.out.println(dorm.student.number);
        System.out.println(dorm.student.address);
            System.out.println(student1.nationality);
            System.out.println(student2.getName());
            System.out.println(student2.age);
            System.out.println(student2.number);
            System.out.println(student2.address);
            System.out.println(Student.nationality);
        Text01 text01 = new Text01();
        text01.doSome();


        }
    public static void  doSome(){
        System.out.println("通过引用的方式调用没有static修饰符的方法");
    }
}
