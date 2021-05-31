package basic;

class TypesVariableDemo {

    int i=10;//instance variable

    static int k = 89;//static variable //

    public void testVariable(){
        int j = 9;//local variable
        System.out.println("in test");
    }


    class Test{

    }
    public static void main(String[] args) {

        TypesVariableDemo obj = new TypesVariableDemo();
        obj.testVariable();
    }
}
