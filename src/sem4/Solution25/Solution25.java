package sem4.Solution25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution25 {
    public static void main(String[] args) throws Exception {
//ввести с консоли несколько ключей (строк)
/*
Создать переменную movie класса Movie и для каждой введенной строки(ключа):
получить объект используя MovieFactory.getMovie и присвоить его переменной movie
вывести на экран movie.getClass().getSimpleName()
*/
        Movie movie;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine()) != null){
            movie = MovieFactory.getMovie(s);
            if (movie == null) break;
            System.out.println(movie.getClass().getSimpleName());
        }
    }
    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;
//создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) movie = new SoapOpera();
            if ("cartoon".equals(key))   movie = new Cartoon();
            if ("thriller".equals(key))  movie = new Thriller();
            return movie;
        }
    }
    static abstract class Movie {
    }
    static class SoapOpera extends Movie {
    }
    static class Thriller extends Movie {
    }
    static class Cartoon extends Movie {
    }
//Напишите тут ваши классы,
}

