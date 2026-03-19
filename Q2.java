public class Q2 {
    public static void main(String[] args) {
        var r = 10;

        runnable r = () -> {
            x = 20; // Error: Cannot assign a value to final variable 'x'
            System.out.println(x);
        };
    r.run();
    }
}
