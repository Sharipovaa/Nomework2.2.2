public class Main {
    public static void main(String[] args) {

        int exist = 500;
        int replenished = 1000;
        int bonus = replenished / 100;

        if (replenished > 100) {
            System.out.println(exist + replenished + bonus);
        } else {
            System.out.println();
        }
    }
}