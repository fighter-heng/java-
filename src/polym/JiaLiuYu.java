package polym;

public class JiaLiuYu  extends Friend{
    public JiaLiuYu() {
        super();
    }
    public JiaLiuYu(String studyNumber, int age) {
        super(studyNumber, age);
    }

    @Override
    public void doSome() {
        System.out.println("贾刘煜经常做黄色");
    }
    public void doO(){
        System.out.println("贾刘煜经常🦌管子");
    }
}
