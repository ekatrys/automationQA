class Cat extends Pet implements Fightble {


    public Cat(String name, Pet.sex sex, boolean isHasOwner, boolean isHasAdress) {
        this.name = name;
        this.isHasOwner = isHasOwner;
        this.isHasAdress = isHasAdress;
    }

    public Cat(String name, colors color) {
        this.name = name;
        this.color = color;
    }

    void voice() {
        System.out.println("Мяу");
    }
}
