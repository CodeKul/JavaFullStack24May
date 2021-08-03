package collection;

public class GenericClass<T>{

    private T t;

    private void add(T t){
        this.t = t;
    }

    private T getT(){
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>();
        genericClass.add(80);

        System.out.println(genericClass.getT());

        GenericClass<String> genericClass1 = new GenericClass<>();
        genericClass1.add("String");

        System.out.println(genericClass1.getT());

    }

}
