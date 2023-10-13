package sem3.Solution37;

public class Solution37 {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }
    interface SimpleObject {
        String NAME = "SimpleObject";
        void onPress();
    }
    interface Button extends SimpleObject {
        final String NAME = "Submit";
        void onPress();
    }
}
