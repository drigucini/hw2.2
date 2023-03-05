class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int powerLust;
    private final int savvy;

    public SlytherinStudent(String name, String surname, int transgressionDistance, int spellPower, int cunning, int determination, int ambition, int powerLust, int savvy) {
        super(name, surname, transgressionDistance, spellPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.powerLust = powerLust;
        this.savvy = savvy;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public int getSavvy() {
        return savvy;
    }

    @Override
    public String toString() {
        return "Full name " + getName() + " " + getSurname() +
                "\nStats (" + getSpellPower() +
                ", " + getTransgressionDistance() +
                ")\ncunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", powerLust = " + powerLust +
                ", savvy = " + savvy;
    }

    public static void compareStudents(SlytherinStudent nameFirst, SlytherinStudent nameSecond) {
        int first = nameFirst.getCunning() + nameFirst.getDetermination() + nameFirst.getAmbition() + nameFirst.getPowerLust()+ nameFirst.getSavvy();
        int second = nameSecond.getCunning() + nameSecond.getDetermination() + nameSecond.getAmbition() + nameSecond.getPowerLust() + nameFirst.getSavvy();
        if (first > second) {
            System.out.println("\n" + nameFirst.getName() + " is a better Slytherin student than " + nameSecond.getName());
        } else {
            System.out.println("\n" + nameSecond.getName() + " is a better Slytherin student than " + nameFirst.getName());
        }
    }
}