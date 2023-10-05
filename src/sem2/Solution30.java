package sem2;

import java.util.ArrayList;
import java.util.List;

public class Solution30 {

    public static void main(String[] args) {
        Human child1 = new Human("Child1", true, 1,new ArrayList<>());
        Human child2 = new Human("Child2", true, 2,new ArrayList<>());
        Human child3 = new Human("Child3", false, 3,new ArrayList<>());
        Human parent1 = new Human("Parent1", true, 30, List.of(child1, child2, child3));
        Human parent2 = new Human("Parent2", false, 35, List.of(child1, child2, child3));
        Human oldParent1 = new Human("Old Parent1", true, 60, List.of(parent1));
        Human oldParent2 = new Human("Old Parent2", false, 65, List.of(parent1));
        Human oldParent3 = new Human("Old Parent3", true, 70, List.of(parent2));
        Human oldParent4 = new Human("Old Parent4", false, 75, List.of(parent2));
        List<Human> modestFamily = new ArrayList<>(List.of(child1, child2, child3, parent1, parent2, oldParent1, oldParent2, oldParent3, oldParent4));
        for (Human human: modestFamily) System.out.println(human);
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children;

        public Human(String name, boolean sex, int age, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;
                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }

    }
}
