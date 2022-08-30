public class WrapperDemo {


    public static void main(String[] args) {

        //Value is stored in a primitive datatype
        int i = 10;


        //Value is stored in an object, Wrapper Classes - Boxing
        Integer ii = new Integer(10);
        Double zz = new Double(2.2);

        int j = ii.intValue(); // Unboxing - Unwrapping
        double d = zz.doubleValue(); // Unboxing - Unwrapping


        Integer value = i;  //Autoboxing

        int k = value; //Auto-unboxing


        String str = "123";

        int n = Integer.parseInt(str);
        System.out.println(n);




    }

}
