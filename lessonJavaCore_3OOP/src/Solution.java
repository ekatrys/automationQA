public class Solution {
    public static void main(String[] arg) {
        // Solution 1
        Cat CatMale = new Cat("Василий", Pet.sex.MALE, true, true);
        Cat CatFemale = new Cat("Клавдия", Pet.sex.FEMALE, true, true);

        Dog DogHomeless = new Dog("Бездомный пес", false);
        Dog DogWithoutName = new Dog(null, true);

        int randomNumber = ((int) Math.random() * 10);

        //Solution 2
        CatMale.setAge(randomNumber);
        CatMale.setPower(randomNumber);
        CatMale.setWeight(randomNumber);

        CatFemale.setAge(randomNumber);
        CatFemale.setPower(randomNumber);
        CatFemale.setWeight(randomNumber);

        //Solution 3
        DogHomeless.setAge(randomNumber);
        DogHomeless.setPower(randomNumber);
        DogHomeless.setWeight(randomNumber);

        DogWithoutName.setAge(randomNumber);
        DogWithoutName.setPower(randomNumber);
        DogWithoutName.setWeight(randomNumber);

        Pet[] petsFighters = {CatMale, CatFemale, DogHomeless, DogWithoutName};
        Pet winner = petsFighters[0];

        for (int numberOfPet = 1; numberOfPet < petsFighters.length; numberOfPet++) {
            System.out.print("Раунд " + (numberOfPet) + "  " + winner.name + " против "
                    + petsFighters[numberOfPet].name + " закончился");

            winner = winner.fightWinner(petsFighters[numberOfPet]);

            if (winner != null) System.out.println(" победой " + winner.name);
            else System.out.println(" в ничью ");
        }
    }

}
