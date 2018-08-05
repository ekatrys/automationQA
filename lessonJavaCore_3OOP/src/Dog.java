class Dog extends Pet implements Fightble  {

    public Dog(String name, boolean isHasAdress) {
        this.name = name;
        this.isHasAdress = isHasAdress;
    }

    @Override
    void voice() {
        System.out.println("Гав");
    }
}
