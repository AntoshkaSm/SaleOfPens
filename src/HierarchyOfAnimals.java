public class HierarchyOfAnimals {
    public static void main(String[] args) {
        AbstractAnimal cat = new AbstractAnimal();
        System.out.println(cat.getName());
    }
}
/*Родительский класс должен содержать 4 метода*/
class Animal {
    String breed = "Английская";
    String name = "Васька";
    Double cost = 1000.0;
    String character = "Весёлая";
}
/*Дочерний класс должен содержать 5 полей*/
class AbstractAnimal extends Animal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;

    public AbstractAnimal(String breed, String name, Double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    public String getBreed(){
        return breed;
    }
    public String getName() {
        return name;
    }
    public Double getCost() {
        return cost;
    }
    public String getCharacter() {
        return character;
    }
}
/*
Дочерний класс Хищник
 */
class Predator extends AbstractAnimal {
}
/*
Дочерний класс Волк
 */
class Wolf extends Predator {
}
/*
Дочерний класс Акула
 */
class Shark extends Predator {
}
/*
Дочерний класс Питомец
 */
class Pet extends AbstractAnimal {
}
/*
Дочерний класс Собака
 */
class Dog extends Pet {
}
/*
Дочерний класс Кот
 */
class Cat extends Pet {
}




/*
System.out.println("Мои животные");

String[] breeds = {"Английский", "Средиземноморский","Восточный","Африканский","Немецкий",
        "Малый","Русский","Южный","Северный","Бразильский"};

String[] names = {"Барбос", "Томас","Томат","Рекс","Эйс",
        "Баки","Герда","Рокси","Вайс","Вайт"};

Double[] costs = {1000.0, 2000.0, 3000.0, 4000.0, 5000.0,
        6000.0, 7000.0, 8000.0, 9000.0, 10000.0};

String[] characters = {"Злой", "Добрый","Буйный","Спокойный","Активный",
        "Ленивый","Хитрый","Ласковый","Верный","Весёлый"};*/