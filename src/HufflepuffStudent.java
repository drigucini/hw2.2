public class HufflepuffStudent extends HogwartsStudent {
    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public HufflepuffStudent(String name, String surname, int transgressionDistance, int spellPower, int industriousness, int loyalty, int honesty) {
        super(name, surname, transgressionDistance, spellPower);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Full name " + getName() + " " + getSurname() +
                "\nStats (" + getSpellPower() +
                ", " + getTransgressionDistance() +
                ")\nindustriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty;
    }

    public static void compareStudents(HufflepuffStudent nameFirst, HufflepuffStudent nameSecond) {
        int first = nameFirst.getIndustriousness() + nameFirst.getLoyalty() + nameFirst.getHonesty();
        int second = nameSecond.getIndustriousness() + nameSecond.getLoyalty() + nameSecond.getHonesty();
        if (first > second) {
            System.out.println("\n" + nameFirst.getName() + " is a better Hufflepuff student than " + nameSecond.getName());
        } else {
            System.out.println("\n" + nameSecond.getName() + " is a better Hufflepuff student than " + nameFirst.getName());
        }
    }
}
