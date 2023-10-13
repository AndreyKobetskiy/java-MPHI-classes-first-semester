package sem3.Solution35;

public class Solution35 {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public enum Language {
        ENGLISH ("английского"),
        RUSSIAN ("руского");

        private final String name;

        Language(String name) {
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }
    }

    public static class EnglishTranslator extends Translator{
        private final Language language = Language.ENGLISH;
        @Override
        public Language getLanguage() {
            return language;
        }
    }
    public static abstract class Translator {
        public abstract Language getLanguage();
        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }
}
