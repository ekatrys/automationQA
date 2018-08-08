abstract class Pet implements Fightble {

    String name;
    enum sex {MALE, FEMALE}
    private int age;
    private int weight;
    private int power;
    boolean isHasOwner;
    boolean isHasAdress;
    public enum colors {ORANGE, RED, WHITE, BLACK}
    colors color;

    public String getName() {
        return name;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    abstract void voice();

    public void run() { System.out.println("Могу бегать"); }
    public void eat() { System.out.println("Могу есть"); }

    @Override
    public Pet fightWinner (Pet anotherPet) {
        int ageResult;
        int weightResult;
        int powerResult;

        if (this.getAge() == anotherPet.getAge()) ageResult = 0;
        else ageResult = this.getAge() < anotherPet.getAge() ? 1 : -1;

        if (this.getWeight() == anotherPet.getWeight()) weightResult = 0;
        else weightResult = this.getWeight() > anotherPet.getWeight() ? 1 : -1;

        if (this.getPower() == anotherPet.getPower()) powerResult = 0;
        else powerResult = this.getPower() > anotherPet.getPower() ? 1 : -1;

        int resultFight = ageResult + weightResult + powerResult;
        if (resultFight > 0) return this;
        else if (resultFight < 0) return anotherPet;
        else return null;
    }
}

