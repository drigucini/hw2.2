class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int powerLust;
    private int savvy;

    public Slytherin(String name, String surname, int id, int transgressionDistance, int spellPower, int cunning, int determination, int ambition, int powerLust, int savvy) {
        super(name, surname, id, transgressionDistance, spellPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.powerLust = powerLust;
        this.savvy = savvy;
    }
}