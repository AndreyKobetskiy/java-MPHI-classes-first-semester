package sem1;

import jdk.jshell.spi.ExecutionControl;
import java.util.ArrayList;

public class Cat {
    public static String classVersion = "1.0";
    private final String name;
    private String owner;

    public String getOwner(){
        return owner;
    }
    public void setOwner(final String owner){
        this.owner = owner;
    }

    private Cat() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("qwerty");
    }

    public Cat(final String name){
        this.name = name;
    }
    public Cat(final String name, final String owner){
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString(){
        return "sem1.Cat {name="+name+", owner="+owner+"}";
    }
}
