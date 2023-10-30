package sem4.Solution37;
// в чем конкретно состоит задача
// "В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными
//  способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось
//  расширение видимости."
// я не понял. Оно и так работает и выводит вроде, что надо без модификаторов доступа
public class Solution37 {
    public static void main(String[] args) {
        new Solution37.LuxuriousCar().printlnDesire();
        new Solution37.CheapCar().printlnDesire();
        new Solution37.Ferrari().printlnDesire();
        new Solution37.Lanos().printlnDesire();
    }
    public static class LuxuriousCar{
        public void printlnDesire() {
            System.out.println(StringConstants.WANT_STRING.toString() + StringConstants.LUXURIOUS_CAR);
        }
    }
    public static class CheapCar{
        public void printlnDesire() {
            System.out.println(StringConstants.WANT_STRING.toString() + StringConstants.CHEAP_CAR);
        }
    }
    public static class Ferrari extends LuxuriousCar{
        @Override
        public void printlnDesire() {
            System.out.println(StringConstants.WANT_STRING.toString() + StringConstants.FERRARI_NAME);
        }
    }
    public static class Lanos extends CheapCar{
        @Override
        public void printlnDesire() {
            System.out.println(StringConstants.WANT_STRING.toString() + StringConstants.LANOS_NAME);}
    }
    // Заметим, что enum по-сути похож на такой класс. Если вы корректно замените данный
    //класс на перечисление, то это будет оценено дополнительными баллами, как новая задача
    enum StringConstants{
        WANT_STRING ("Я хочу ездить на "),
        CHEAP_CAR("дешевой машине"),
        FERRARI_NAME("Феррари"),
        LANOS_NAME("Ланосе"),
        LUXURIOUS_CAR("роскошной машине");

        private final String title;
        StringConstants(String title) { this.title = title; }
        public String getTitle() { return title; }
        @Override
        public String toString() { return title; }

    }
    /*
    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
     */
}
