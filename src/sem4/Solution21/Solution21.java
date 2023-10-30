package sem4.Solution21;

public class Solution21 {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }
    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
    interface Bridge{
        int getCarsCount();

    }
    static class WaterBridge implements Bridge {
        private int cars = 10101;
        @Override
        public int getCarsCount() {
            return cars;
        }
    }

    static class SuspensionBridge implements Bridge {
        private int cars = 606;
        @Override
        public int getCarsCount() {
            return cars;
        }
    }
}
