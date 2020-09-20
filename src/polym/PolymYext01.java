package polym;

public class PolymYext01 {
    public static void main(String[] args) {
        Dorm dorm = new Dorm();
        dorm.name="长思二217宿舍";
        dorm.num=6;
        Friend friend = new ChangMingXuan();
        dorm.friend=friend;
        ChangMingXuan changMingXuan= (ChangMingXuan)friend;
        friend.name="常铭轩";
        friend.age=23;
        friend.setStudyNumber("03182008");
        Friend friend1 = new JiaLiuYu();
//        dorm.friend=jiaLiuYu;
        friend1.name="贾刘煜";
        friend1.age=20;
        friend1.setStudyNumber("03182007");
        System.out.println("欢迎来到217宿舍");
        System.out.println(dorm.name);
        System.out.println(dorm.num+"个人");
        System.out.println("---------------------");
        if (friend1 instanceof JiaLiuYu){
            System.out.println(friend1.name);
            System.out.println(friend1.age);
            System.out.println(friend1.getStudyNumber());
            friend1.doSome();
            ((JiaLiuYu) friend1).doO();
        }
        System.out.println("--------------------");
        if (friend instanceof ChangMingXuan){
            System.out.println(friend.name);
            System.out.println(friend.age);
            System.out.println(friend.getStudyNumber());
            friend.doSome();
            changMingXuan.doOther();
        }
    }
}
