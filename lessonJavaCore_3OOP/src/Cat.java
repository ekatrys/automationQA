class Cat extends Pet implements Fightble {


    public Cat(String name, String sex, boolean isHasOwner, boolean isHasAdress) {
        this.name = name;
        sex.valueOf(sex);
        this.isHasOwner = isHasOwner;
        this.isHasAdress = isHasAdress;
    }

    void voice() {
        System.out.println("Мяу");
    }
}
