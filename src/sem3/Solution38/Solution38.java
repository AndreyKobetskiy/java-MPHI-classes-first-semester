package sem3.Solution38;

public class Solution38 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }
    static class Today implements Weather{
        @Override
        public String getWeatherType() {
            // лучше сделать WeatherType enum-ом и работать с ним
            // нельзя возвращять объект типа WeatherType потому что он содержит сразу все состояния
            return type;
        }

        private String type;
        Today(String type) {
            this.type = type;
        }
        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }
    }
}
