class OurRandom {

    public static int randomNumber() {
        return ((int) (Math.random() * 10));
    }
}

public class Solution {

    public static void main(String[] arg) {
        // Solution 1
        Cat CatMale = new Cat("Василий", Pet.sex.MALE, true, true);
        Cat CatFemale = new Cat("Клавдия", Pet.sex.FEMALE, true, true);

        Dog DogHomeless = new Dog("Бездомный пес", false);
        Dog DogWithoutName = new Dog(null, true);

        //Solution 2
        CatMale.setAge(OurRandom.randomNumber());
        CatMale.setPower(OurRandom.randomNumber());
        CatMale.setWeight(OurRandom.randomNumber());

        CatFemale.setAge(OurRandom.randomNumber());
        CatFemale.setPower(OurRandom.randomNumber());
        CatFemale.setWeight(OurRandom.randomNumber());

        //Solution 3

        DogHomeless.setAge(OurRandom.randomNumber());
        DogHomeless.setPower(OurRandom.randomNumber());
        DogHomeless.setWeight(OurRandom.randomNumber());

        DogWithoutName.setAge(OurRandom.randomNumber());
        DogWithoutName.setPower(OurRandom.randomNumber());
        DogWithoutName.setWeight(OurRandom.randomNumber());

        Pet[] petsFighters = {CatMale, CatFemale, DogHomeless, DogWithoutName};
        Pet winner = petsFighters[0];


        //Драка на вылет
        for (int numberOfPet = 1; numberOfPet < petsFighters.length; numberOfPet++) {
            System.out.print("Раунд " + (numberOfPet) + "  " + winner.name + " против "
                    + petsFighters[numberOfPet].name + " закончился");

            winner = winner.fightWinner(petsFighters[numberOfPet]);

            if (winner != null) System.out.println(" победой " + winner.name);
            else {
                System.out.println(" в ничью ");
                winner = petsFighters[numberOfPet];
            }
        }
    }
}
