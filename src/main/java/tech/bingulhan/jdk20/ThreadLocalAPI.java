package tech.bingulhan.jdk20;

public class ThreadLocalAPI {

    /**
     *
     * ThreadLocal class is used to store variables. A distinctive feature of this class is that it maintains a separate and independent copy of a value for each thread that uses it.
     *
     */

    public static void main(String[] args) {

        ThreadLocal<Integer> exampleProtocolVersion = new ThreadLocal<>();
        exampleProtocolVersion.set(21);


        Integer protocolVersion = exampleProtocolVersion.get();
        exampleProtocolVersion.set(22);

        //exampleProtocolVersion.remove();


    }
}
