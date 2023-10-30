package sem4.Solution32;

public class Solution32 {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }
    static class HenFactory {
        static Hen getHen(Country country) {
            Hen hen = null;
            if (country.equals(Country.UKRAINE)) hen = new UkrainianHen();
            if (country.equals(Country.RUSSIA)) hen = new RussianHen();
            if (country.equals(Country.MOLDOVA)) hen = new MoldovanHen();
            if (country.equals(Country.BELARUS)) hen = new BelarusianHen();
            return hen;
        }
    }
    abstract static class Hen{
        String getDescription(){
            return "Я - курица.";
        }
        abstract int getCountOfEggsPerMonth();
    }
    static class RussianHen extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 1;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - Россия. Я несу "
                    + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }
    static class UkrainianHen extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 2;
        }
        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - Украина. Я несу "
                    + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }
    static class MoldovanHen extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 3;
        }
        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - Молдавия. Я несу "
                    + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }
    static class BelarusianHen extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 4;
        }
        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - Беларусь. Я несу "
                    + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    public enum Country {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        MOLDOVA("Moldova"),
        BELARUS("Belarus");
        private final String title;
        Country(String title) { this.title = title; }
        public String getTitle() { return title; }
        @Override
        public String toString() { return title; }
    }
}
