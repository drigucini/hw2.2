class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int id, int transgressionDistance, int spellPower, int nobility, int honor) {
        super(name, surname, id, transgressionDistance, spellPower);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Full name " + getName() + " " + getSurname() +
                "\nStats (" + getSpellPower() +
                ", " + getTransgressionDistance() +
                ")\nnobility = "+ nobility +
                ", honor = " + honor +
                ", courage = " + courage;
    }
}

