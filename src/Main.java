
public class Main {

    public static void main(String[] args) {

        // Task 1

        int i = 1;
        while (i < 11) {
            System.out.print(" " + i++);

        }
        System.out.println();

        for (int i1 = 10; i1 > 0; i1--) {

            System.out.print(" " + i1);
        }
        System.out.println();

        // Task 2

        int friday = 7;

        for (int i2 = 7; i2 < 31; i2 = i2 + 7) {
            System.out.println("\n" + "Сегодня пятница " + i2 + "-е число");
        }
        System.out.println();


    // Task 3

    int startYear = 1896;
    int endYear = 2122;
    int period = 79;

        for(int i3 = 1896; i3< 2122;i3 =i3 +79)

    {
        System.out.println("Все года за последние 200 лет когда рядом с Землей пролетали комметы " + i3);

    }
}
}




