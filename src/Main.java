import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        byte min = 0;
        byte max = 100;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randomNum);

        Gryffindor hermione = new Gryffindor("Hermione", "Strange", (byte) 12, (byte) 25, (byte) 4, (byte) 4, (byte) 4);

    }
}