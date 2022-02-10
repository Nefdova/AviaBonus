import java.net.StandardSocketOptions;

public class AviaBonus {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        int ticketPrice = 1000;
        int rubsPerBonus = 20;

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int bonusCount = ticketPrice / rubsPerBonus;
        System.out.println(bonusCount);
    }
}
