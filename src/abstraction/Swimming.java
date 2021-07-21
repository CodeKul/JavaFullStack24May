package abstraction;

public class Swimming implements SportInterface,Sport2Interface{

    @Override
    public void play() {
        System.out.println("Playing swim");
    }


    public static void main(String[] args) {
       SportInterface obj = new Swimming();
        obj.play();
    }
}
