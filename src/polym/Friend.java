package polym;

 abstract   public class Friend extends Object{
   static String name;
   private  String studyNumber;
    int age ;

     public Friend() {
         super();
     }

     public Friend(String studyNumber, int age) {
         super();
         this.studyNumber = studyNumber;
         this.age = age;
     }

     abstract public void  doSome();

     public String getStudyNumber() {
         return studyNumber;
     }

     public void setStudyNumber(String studyNumber) {
         this.studyNumber = studyNumber;
     }
 }
