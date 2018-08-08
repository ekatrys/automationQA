class Dog extends Pet implements Fightble {

    public Dog(String name, boolean isHasAdress) {
        this.name = name;
        this.isHasAdress = isHasAdress;
    }

    public Dog(String name, colors color) {
        this.name = name;
        this.color = color;
    }

    @Override
    void voice() {
        System.out.println("Гав");
    }
}
