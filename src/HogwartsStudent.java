abstract public class HogwartsStudent {
    private final String name;
    private final String surname;
    private final int transgressionDistance;
    private final int spellPower;

    public HogwartsStudent(String name, String surname, int transgressionDistance, int spellPower) {
        this.transgressionDistance = transgressionDistance;
        this.spellPower = spellPower;
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", transgressionDistance=" + transgressionDistance +
                ", spellPower=" + spellPower +
                '}';
    }

    private int calculateBasicAttributes() {
        return transgressionDistance + spellPower;
    }
    public static void compareStudentsPower(HogwartsStudent firstStudent, HogwartsStudent secondStudent) {
        if (firstStudent.calculateBasicAttributes()> secondStudent.calculateBasicAttributes()) {
            System.out.println("\n" + firstStudent.getName() + " is more powerful than " + secondStudent.getName());
        } else {
            System.out.println("\n" + secondStudent.getName() + " is more powerful than " + firstStudent.getName());
        }
    }

    public static void printStudent(HogwartsStudent name) {
        System.out.println();
        System.out.println(name);
    }
}