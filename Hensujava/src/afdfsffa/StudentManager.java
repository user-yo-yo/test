package afdfsffa;

public class StudentManager {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStatus(10, 1);

        Student student2 = new Student();
        student2.setStatus(20, 2);

        System.out.println("student1のid:" + student1.getID());
        System.out.println("student1のclassNo:" + student1.getClassNo());
        System.out.println("student2のid:" + student2.getID());
        System.out.println("student2のclassNo:" + student2.getClassNo());

        if(student1.classNo==2){
        	System.out.println("staicによるクラス変数化の成功");
        }else{
        	System.out.println("失敗");
        }
        if(student1.id==0){
        	System.out.println("失敗");
        }else{
        	System.out.println("成功");
        }
    }
}