import java.util.*;
import java.util.ArrayList;

class AnimalInShelter {

    static Pet addRandomAnimal(int numberAnimal) {
        Pet obj = null;
        int randomNumber = new Random().nextInt(2);
        int randomNumberColors = new Random().nextInt(4);
        switch (randomNumber) {
            case 0:
                obj = new Cat(Integer.toString(numberAnimal), Pet.colors.values()[randomNumberColors]);
                break;
            case 1:
                obj = new Dog(Integer.toString(numberAnimal), Dog.colors.values()[randomNumberColors]);
                break;
        }
        return obj;
    }

    static void randomAnimal(ArrayList<Pet> animalShelterList) {
        int numberAnimal = animalShelterList.size();
        int randomNumber = new Random().nextInt(numberAnimal);
        Collections.shuffle(animalShelterList);
        System.out.println("Вы взяли " + getAnimalType(animalShelterList.get(randomNumber).getClass().toString())
                + " с именем " + animalShelterList.get(randomNumber).name);
    }

    static void animalWithParametrs(ArrayList<Pet> animalShelterList, String type, Pet.colors color) {
        String needPet = animalShelterList.stream().
                filter(p -> p.getClass().toString().equals(type) && p.color == color).findFirst().map(Pet::getName).
                orElse("нет кого");
        System.out.println("Вы хотите " + getAnimalType(type) + " " + color + " цвета ");
        System.out.println("У нас для вас " + needPet);
    }

    private static String getAnimalType(String type) {
        if (type == ("class Dog")) return "собаку";
        else return "кошку";
    }
}

public class Solution_Collections {

    public static void main(String[] arg) {

        System.out.println("Введите колличество мест в вашем приюте:");
        Scanner reader = new Scanner(System.in);
        int inputCharInt = reader.nextInt();
        if (inputCharInt != 0) {

            ArrayList<Pet> animalShelterList = new ArrayList();
            int n = 0;

            for (int i = 0; i < inputCharInt; i++) {
                animalShelterList.add(AnimalInShelter.addRandomAnimal(n++));
            }
            AnimalInShelter.randomAnimal(animalShelterList);
            AnimalInShelter.animalWithParametrs(animalShelterList, "class Dog", Pet.colors.BLACK);
        } else System.out.println("Ваш приют пуст");
    }
}