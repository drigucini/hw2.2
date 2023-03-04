public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int id, int transgressionDistance, int spellPower, int industriousness, int loyalty, int honesty) {
        super(name, surname, id, transgressionDistance, spellPower);
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
}
