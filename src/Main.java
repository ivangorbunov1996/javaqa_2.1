public class Main {
    public static void main(String[] args) {

        int balance = 5_100;
        int addend = 1000;

        int bonus = 0;

        if (addend > 1_000)
            bonus = addend / 100;

        int finalbalanse = balance + addend + bonus;
        System.out.println("Итоговый баланс: " + finalbalanse);
        System.out.println("Бонус:" + bonus);

    }
}