package string;

public class StringDemo {

    public static void main(String[] args) {
        String city1 = new String("Nagpur");// 2 object created
        String city3 = new String("Nagpur");// 1 object created


        String city = "Pune";//1 object created
        String city2 = "Pune";//0 object created
        String city6 = "Kolhapur";//0 object created
        String city5 = "Pune";//0 object created
        city5.concat("is Biggest city");//String is immutable

        System.out.println(city5);

        String city4 = new String("Pune");//1 object created
//
        String str = "Good Morning";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo("Good Morning"));


    }
}
