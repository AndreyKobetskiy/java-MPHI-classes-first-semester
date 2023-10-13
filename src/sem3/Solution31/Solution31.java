package sem3.Solution31;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution31 {
    //TODO
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((new StringObject().getInstance(reader.readLine()).getData()));
    }
    interface SimpleObject<T> {
        SimpleObject<T> getInstance(T t);
    }
    static class StringObject implements SimpleObject<String> {
        public String getData() {
            return data;
        }
        private String data;
        @Override
        public StringObject getInstance(String s) {
            this.data = s;
            return this;
        }

    }
}
