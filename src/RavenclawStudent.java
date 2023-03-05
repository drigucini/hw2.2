public class RavenclawStudent extends HogwartsStudent {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public RavenclawStudent(String name, String surname, int transgressionDistance, int spellPower, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, transgressionDistance, spellPower);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Full name " + getName() + " " + getSurname() +
                "\nStats (" + getSpellPower() +
                ", " + getTransgressionDistance() +
                ")\nintelligence " + intelligence +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creativity = " + creativity;
    }
    public static void compareStudents(RavenclawStudent nameFirst, RavenclawStudent nameSecond) {
        int first = nameFirst.getIntelligence() + nameFirst.getWisdom() + nameFirst.getWit() + nameFirst.getCreativity();
        int second = nameSecond.getIntelligence() + nameSecond.getWisdom() + nameSecond.getWit() + nameSecond.getCreativity();
        if (first > second) {
            System.out.println("\n" + nameFirst.getName() + " is a better Ravenclaw student than " + nameSecond.getName());
        } else {
            System.out.println("\n" + nameSecond.getName() + " is a better Ravenclaw student than " + nameFirst.getName());
        }
    }
}
