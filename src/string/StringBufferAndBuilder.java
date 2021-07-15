package string;

//String buffer and builder are used for mutable(modified) string
public class StringBufferAndBuilder {
    public static void main(String[] args) {

        //Thread safe
        StringBuffer stringBuffer = new StringBuffer("Good");
        stringBuffer.append("Morning");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(0));
        System.out.println(stringBuffer.lastIndexOf("d"));


        //Not Thread safe
        StringBuilder stringBuilder = new StringBuilder("Pune");
        stringBuilder.append("Mumbai");
        System.out.println(stringBuilder);
    }
}
