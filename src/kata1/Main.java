package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person pau = new Person("Pau", new Date(82,3,24));
        System.out.println(pau.getName() + " tiene " + pau.getAge());
    }
    
}
