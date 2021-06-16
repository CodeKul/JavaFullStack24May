package statickeyword;

public class StudentStatic {

    static class Marks{
        static int physics=70;
        int chemistry=80;
        int maths =90;
    }

    //object will be created at once


}

class StudentMain{

    public static void main(String[] args) {
//        StudentStatic.Marks obj = new StudentStatic().new Marks();
//        System.out.println(obj.maths);

        StudentStatic obj = new StudentStatic();
        StudentStatic obj1 = new StudentStatic();
        StudentStatic obj2 = new StudentStatic();


//        StudentStatic.Marks obj = new StudentStatic.Marks();
//        System.out.println(StudentStatic.Marks.physics);

    }
}
