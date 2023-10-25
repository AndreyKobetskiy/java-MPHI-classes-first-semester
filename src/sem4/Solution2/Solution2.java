package sem4.Solution2;

public class Solution2 {
    static void print(int i){
        System.out.println(i);
    }
    static  void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        print(123);
        print("not 123");
    }
}
