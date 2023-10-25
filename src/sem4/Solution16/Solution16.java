package sem4.Solution16;

import java.awt.*;

public class Solution16 {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }
    public interface Animal {
        java.awt.Color getColor();
    }
    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }

        @Override
        public Color getColor() {
            return null;
        }
    }
    public static class BigFox extends Fox{}
}
