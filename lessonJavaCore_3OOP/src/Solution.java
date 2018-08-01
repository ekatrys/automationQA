
public class Solution {
    public static void main(String[] arg) {
        // Solution 1
        Cat CatMale = new Cat(true, "male", true, true);
        Cat CatFemale = new Cat(true, "female", true, true);

        Dog DogHomeless = new Dog(true, false);
        Dog DogWithoutName = new Dog(false, true);


        //Solution 2
        CatMale.setName("Василий");
        CatMale.setAge((int) (Math.random() * 10));
        CatMale.setPower((int) (Math.random() * 10));
        CatMale.setWeight((int) (Math.random() * 10));


        CatFemale.setName("Клавдия");
        CatFemale.setAge((int) (Math.random() * 10));
        CatFemale.setPower((int) (Math.random() * 10));
        CatFemale.setWeight((int) (Math.random() * 10));

        CatMale.fight(CatFemale);

        //Solution 3

        DogHomeless.setName("Бездомный пес");
        DogHomeless.setAge((int) (Math.random() * 10));
        DogHomeless.setPower((int) (Math.random() * 10));
        DogHomeless.setWeight((int) (Math.random() * 10));

        DogWithoutName.setName("Домашняя псина");
        DogWithoutName.setAge((int) (Math.random() * 10));
        DogWithoutName.setPower((int) (Math.random() * 10));
        DogWithoutName.setWeight((int) (Math.random() * 10));

        Pet[] p = {CatMale, CatFemale, DogHomeless, DogWithoutName};

        int y = 3;

        for (int x = 0; p.length - 1 > x; x++) {
            if (p[x].fight(p[y]) == true) {
                y = x;
                System.out.println(" бой " + (x + 1) + " " + p[x].getName() + " против " + p[y].getName() +
                        " выигрывает " + p[y].getName());
            } else
                System.out.println(" бой " + (x + 1) + " " + p[x].getName() + " против " + p[y].getName() +
                        " выигрывает " + p[y].getName());
        }
    }

}
