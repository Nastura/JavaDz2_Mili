public class Main {
    public static void main(String[] args) {

        int price = 13_676;
        int minAmountForBonusAccrual = 20;

        if (price >= 20) {
            int bonusMili = price / minAmountForBonusAccrual;
            System.out.println("Спасибо за покупку! Бонусные мили за покупки: " + bonusMili);
        } else {
            System.out.println("Не хватает суммы покупки");
        }

    }
}