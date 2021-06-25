package multithreading;

public class AnonymousInnerClass {

    public static void main(String[] args) {
//        AnonymousInnerClass obj = new AnonymousInnerClass();

        MyInterface myInterface = new MyInterface() {
            @Override
            public Integer add(int i, int j) {
                return i + j;
            }
        };//Anonymous Inner Class
        System.out.println(myInterface.add(2, 9));
    }
}


interface MyInterface{

    Integer add(int i,int j);
}