class Slytherin extends Hogwarts {
    private byte cunning;
    private byte determination;
    private byte ambition;
    private byte powerLust;
    private byte savvy;

    public Slytherin(String name, String surname, int id, byte transgressionDistance, byte spellPower, byte cunning, byte determination, byte ambition, byte powerLust, byte savvy) {
        super(name, surname, id, transgressionDistance, spellPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.powerLust = powerLust;
        this.savvy = savvy;
    }

    public void setCunning(byte cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(byte determination) {
        this.determination = determination;
    }

    public void setAmbition(byte ambition) {
        this.ambition = ambition;
    }

    public void setPowerLust(byte powerLust) {
        this.powerLust = powerLust;
    }

    public void setSavvy(byte savvy) {
        this.savvy = savvy;
    }
}