abstract class Pet implements Fightble {

    String name;
    String sex;
    int age;
    int weight;
    int power;
    boolean isHasName;
    boolean isHasOwner;
    boolean isHasAdress;


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

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
    public boolean fight(Pet anotherPet) {
        int ageResult = this.getAge() < anotherPet.getAge() ? 1 : 0;
        int weightResult = this.getWeight() > anotherPet.getWeight() ? 1 : 0;
        int powerResult = this.getPower() > anotherPet.getPower() ? 1 : 0;

        int resultFight = ageResult + weightResult + powerResult;
        return resultFight > 2;
    }
}

