public class AnotherForLoop {
    public static void main(String[] args) {

        //simple for loop
        int i = 0, runs = 0;
        for (i = 10; i < 23; i = i + 3) {
            if (i % 2 == 0) {
                System.out.println("Hey");
            }
            runs++;
        }
        System.out.println("i: " + i + " runs " + runs);
    }
}