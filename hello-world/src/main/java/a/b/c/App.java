package a.b.c;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello,  " + args[0] 
        + "!");
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello World!");
        }

    }
}
