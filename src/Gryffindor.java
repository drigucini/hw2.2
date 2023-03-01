class Gryffindor extends Hogwarts {
    private byte nobility;
    private byte honor;
    private byte courage;

    public Gryffindor(String name, String surname, int id, byte transgressionDistance, byte spellPower, byte nobility, byte honor) {
        super(name, surname, id, transgressionDistance, spellPower);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public byte getNobility() {
        return nobility;
    }

    public byte getHonor() {
        return honor;
    }

    public byte getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}

