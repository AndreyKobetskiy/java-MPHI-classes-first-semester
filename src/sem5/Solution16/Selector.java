package sem5.Solution16;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Selector {
    private static List<Owner> initData() {
        final Owner owner1 = new Owner("Олег Малашков");
        owner1.getPets().addAll(List.of(
                new Cat("Барон", Color.BLACK, 3),
                new Cat("Султан", Color.DARK_GREY, 4),
                new Dog("Эльза", Color.WHITE, 0)
        ));
        final Owner owner2 = new Owner("Дмитрий Васильков");
        owner2.getPets().addAll(List.of(
                new Cat("Рыжик", Color.FOXY, 7),
                new Cat("Барсик", Color.FOXY, 5),
                new Parrot("Адмирал", Color.BLUE, 3)
        ));
        final Owner owner3 = new Owner("Наталия Криж");
        owner3.getPets().addAll(List.of(
                new Dog("Арнольд", Color.FOXY, 3),
                new Pig("Пылесос", Color.LIGHT_GREY, 8)
        ));
        final Owner owner4 = new Owner("Павел Мурахов");
        owner4.getPets().addAll(List.of(
                new Snake("Удав", Color.DARK_GREY, 2)
        ));
        final Owner owner5 = new Owner("Антон Федоренко");
        owner5.getPets().addAll(List.of(
                new Cat("Фишер", Color.BLACK, 16),
                new Cat("Зорро", Color.FOXY, 14),
                new Cat("Марго", Color.WHITE, 3),
                new Cat("Забияка", Color.DARK_GREY, 1)
        ));
        return List.of(owner1, owner2, owner3, owner4, owner5);
    }

    public static void main(String[] args) {
        final List<Owner> owners = initData();
        final List<String> findNames = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(animal -> animal instanceof Cat)
                .sorted(Comparator.comparingInt(Animal::getAge).reversed())
                .map(Animal::getName)
                .toList();
        findNames.forEach(System.out::println);
    }
}
