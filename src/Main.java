public class Main {
    public static void main(String[] args) {

        int exist = 500; // было на счету
        int replenished = 1000; // сумма пополнения

        int bonus = replenished / 100;

        if (replenished > 100) {
            bonus = replenished / 100;
        } else {
          bonus = 0;
        }
        int totally = exist + replenished + bonus;
        System.out.println("Итоговый счет: " + totally + " руб."); System.out.println("Сумма бонуса: " + bonus + " руб.");
    }
}