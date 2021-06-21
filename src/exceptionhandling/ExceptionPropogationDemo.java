package exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionPropogationDemo {

    public void a() throws SQLException, ArithmeticException {
        int i=10;
        int j = i/0;

        throw new SQLException("Sql ex");
    }

    public void b() throws SQLException{
        a();
    }

    public void c() throws SQLException{
//        try {
            b();
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
    }

    public static void main(String[] args) throws SQLException{

        ExceptionPropogationDemo obj = new ExceptionPropogationDemo();//object , instance
        obj.c();

    }
}

/**
 *
 *          Throw                                                          Throws
 *  1. Throw is used to throw the exception                    1.to declare exception
 *  2. Throw is used in the method signature                   2. with method signature
 *  3. Throw is followed by instance/object                    3. throws is followed by class
 *  4. Throw can not be used with multiple Exception           4 we can declare multiple exception
 */