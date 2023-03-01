public class Hogwarts {
    private String name;
    private String surname;
    private byte transgressionDistance;
    private byte spellPower;
    private int id;

    public Hogwarts(String name, String surname, int id, byte transgressionDistance, byte spellPower) {
        this.transgressionDistance = transgressionDistance;
        this.spellPower = spellPower;
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public byte getTransgressionDistance() {
        return transgressionDistance;
    }

    public byte getSpellPower() {
        return spellPower;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", transgressionDistance=" + transgressionDistance +
                ", spellPower=" + spellPower +
                ", id=" + id +
                '}';
    }
}