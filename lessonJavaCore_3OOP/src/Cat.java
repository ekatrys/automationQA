class Cat extends Pet implements Fightble {


    public Cat(boolean isHasName, String sex, boolean isHasOwner, boolean isHasAdress) {
        this.isHasName = isHasName;
        this.sex = sex;
        this.isHasOwner = isHasOwner;
        this.isHasAdress = isHasAdress;
    }

    void voice() {
        System.out.println("Мяу");
    }
}
