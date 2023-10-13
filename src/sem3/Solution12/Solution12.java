package sem3.Solution12;

public class Solution12 {
    public static void main(String[] args) {
        System.out.println("samsung is apple: " + (new SamsungGalaxyS2() instanceof AppleIPhone));
    }
}
class AppleIPhone {}
class SamsungGalaxyS2 extends  AppleIPhone{}