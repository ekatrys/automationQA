class Dog extends Pet implements Fightble  {

    public Dog(boolean isHasName, boolean isHasAdress) {
        this.isHasName = isHasName;
        this.isHasAdress = isHasAdress;
    }

    @Override
    void voice() {
        System.out.println("Гав");
    }
}
