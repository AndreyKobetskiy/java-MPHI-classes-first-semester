package sem4.Solution4;

public class Solution4 {
    static void print(int i){
        System.out.println(i);
    }
    static void print(Integer i){
        System.out.println(i);
    }
    static  void print(String s){
        System.out.println(s);
    }
    static  void print(boolean s){
        System.out.println(s);
    }
    static void print(char c){
        System.out.println(c);
    }

    public static void main(String[] args) {
        print(1);
        print((char) 49);
        print(true);
        print("true");
        print((Integer) 1);
    }
}
