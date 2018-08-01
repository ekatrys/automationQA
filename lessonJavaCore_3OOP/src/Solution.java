
public class Solution {
    public static void main(String[] arg) {
        // Solution 1
        Cat CatMale = new Cat("Василий", "MALE", true, true);
        Cat CatFemale = new Cat("Клавдия", "FEMAIL", true, true);

        Dog DogHomeless = new Dog("Бездомный пес", false);
        Dog DogWithoutName = new Dog(null, true);


        //Solution 2
        CatMale.setAge((int) (Math.random() * 10));
        CatMale.setPower((int) (Math.random() * 10));
        CatMale.setWeight((int) (Math.random() * 10));

        CatFemale.setAge((int) (Math.random() * 10));
        CatFemale.setPower((int) (Math.random() * 10));
        CatFemale.setWeight((int) (Math.random() * 10));

        //Solution 3

        DogHomeless.setAge((int) (Math.random() * 10));
        DogHomeless.setPower((int) (Math.random() * 10));
        DogHomeless.setWeight((int) (Math.random() * 10));

        DogWithoutName.setAge((int) (Math.random() * 10));
        DogWithoutName.setPower((int) (Math.random() * 10));
        DogWithoutName.setWeight((int) (Math.random() * 10));

        Pet[] petsFighters = {CatMale, CatFemale, DogHomeless, DogWithoutName};
        Pet winner = petsFighters[0];

        for (int numberOfPet = 1; numberOfPet < petsFighters.length; numberOfPet ++) {
            System.out.print("Раунд " + (numberOfPet) + "  " + winner.name + " против " + petsFighters[numberOfPet].name + " закончился");

            winner = winner.fightWinner(petsFighters[numberOfPet]);

            if (winner != null) System.out.println(" победой " + winner.name);
            else System.out.println(" в ничью ");
        }
    }

}
