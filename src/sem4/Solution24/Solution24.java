package sem4.Solution24;

public class Solution24 {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

    interface CompItem {
        String getName();
    }

    static class Computer {
        public Keyboard getKeyboard() {
            return keyboard;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        public Mouse getMouse() {
            return mouse;
        }

        public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
            this.keyboard = keyboard;
            this.monitor = monitor;
            this.mouse = mouse;
        }

        private Keyboard keyboard;
        private Monitor monitor;
        private Mouse mouse;

    }

    static class Keyboard implements CompItem {
        @Override
        public String getName() {
            return "Keyboard";
        }
    }

    static class Monitor implements CompItem {
        @Override
        public String getName() {
            return "Monitor";
        }
    }

    static class Mouse implements CompItem {
        @Override
        public String getName() {
            return "Mouse";
        }
    }

}
