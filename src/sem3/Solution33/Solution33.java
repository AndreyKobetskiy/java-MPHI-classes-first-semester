package sem3.Solution33;

public class Solution33 {
    public static void main(String[] args) {

    }
    interface CanMove{
        double speed();
    }
    interface CanFly extends CanMove{
        double speed(CanFly object);
    }
}
