package polym;

public class ChangMingXuan extends Friend{
    public ChangMingXuan() {
    }

    public ChangMingXuan(String studyNumber, int age) {
        super(studyNumber, age);
    }

    @Override
    public void doSome() {
        System.out.println("常铭轩经常搞黄色");
    }
    public  void doOther(){
        System.out.println("常铭轩经常吃粑粑");
    }
}
