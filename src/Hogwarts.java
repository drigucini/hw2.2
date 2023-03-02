public class Hogwarts {
    private String name;
    private String surname;
    private int transgressionDistance;
    private int spellPower;
    private int id;

    public Hogwarts(String name, String surname, int id, int transgressionDistance, int spellPower) {
        this.transgressionDistance = transgressionDistance;
        this.spellPower = spellPower;
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
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