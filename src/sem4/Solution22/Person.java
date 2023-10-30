package sem4.Solution22;


interface Person {

    void saySmth();

    static Person getPersonByKey(String s){

        return switch (s){
            case "user"-> new User();
            case "loser"-> new Loser();
            case "coder" -> new Coder();
            case "proger"-> new Proger();
            default -> null;
        };

    }

    class User implements Person{
        public void live(){
            System.out.println("I usually just live.");
        }

        @Override
        public void saySmth() {
            live();
        }
    }
    class Loser implements Person{
        public void doNothing(){
            System.out.println("I usually do nothing.");
        }

        @Override
        public void saySmth() {
            doNothing();
        }
    }
    class Coder implements Person{
        public void writeCode(){
            System.out.println("I usually write code.");
        }

        @Override
        public void saySmth() {
            writeCode();
        }
    }
    class Proger implements Person{
        public void enjoy(){
            System.out.println("It's a wonderful life!");
        }

        @Override
        public void saySmth() {
            enjoy();
        }
    }


}
