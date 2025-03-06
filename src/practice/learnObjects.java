package practice;

public class learnObjects {
    public static void main(String[] args){
        /*
        * The following code demonstrates inheritance and runtime polymorphism.
        * For polymorphism to work, we create a new parent type object out of an  instance of the child class.
        * For inheritance to work;
        *   1. child class extends the parent class.
        *   2. child class' constructor must first call super(); to ensure safe instantiation of the parent class*/
        InheritedDummyWrapper<Integer> number = new InheritedDummyWrapper<>(50) ;
        System.out.println(number.getClass());

        /*
        * Code to test out the equals and hashcode functions of the object class.
        * It is important to understand the workings of the hashcode and equals members of the
        * object class in order to know how java allocates memory for the said class.*/
        Integer number2 = 2000;
        Double number3 = 2000.0;
        Integer number4 = (int) number2;
        System.out.println(number4.hashCode());
        System.out.println(number2.hashCode());
        System.out.println(number2.equals(number4));

        /*
        Note that .equals will identify equality of values despite their object memory location, and
        == will identify equality of values only if they share the same memory address.
        == and .equals() will return the same boolean value for objects within the range -128 to 127.
        This is because Java has a cache memory of 256 Objects.
         */
        Character ch = 300;
        Character ch2 = 300;
        Character ch3 = 126;
        Character ch4 = 126;
        System.out.println(ch.equals(ch2));
        System.out.println(ch == ch2);
        System.out.println(ch3.equals(ch4));
        System.out.println(ch3 == ch4);

        InheritedDummyWrapper<Integer> clone = number.clone();
        System.out.println("Mambo ya clone hapa");
        System.out.println(clone.equals(number));
        System.out.println(clone == number);
        System.out.println(clone.testMethod());
        System.gc();
        System.out.println(number.testMethod());
//
//        Object test = new Object();
//        Object testClone = test.clone();
    }
}
