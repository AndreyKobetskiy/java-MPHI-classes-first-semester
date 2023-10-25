package sem4.Solution15;

public class Solution15 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
        System.out.println(stringObject);
    }
    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
    static class StringObject implements SimpleObject{

        @Override
        public StringObject getInstance() {
            return new StringObject();
        }
    };
}
