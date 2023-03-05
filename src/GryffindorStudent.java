class GryffindorStudent extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int courage;

    public GryffindorStudent(String name, String surname, int transgressionDistance, int spellPower, int nobility, int honor, int courage) {
        super(name, surname, transgressionDistance, spellPower);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Full name " + getName() + " " + getSurname() +
                "\nStats (" + getSpellPower() +
                ", " + getTransgressionDistance() +
                ")\nnobility = "+ nobility +
                ", honor = " + honor +
                ", courage = " + courage;
    }

    public static void compareStudents(GryffindorStudent nameFirst, GryffindorStudent nameSecond) {
        int first = nameFirst.getHonor() + nameFirst.getNobility() + nameFirst.getCourage();
        int second = nameSecond.getHonor() + nameSecond.getNobility() + nameSecond.getCourage();
        if (first > second) {
            System.out.println("\n" + nameFirst.getName() + " is a better Gryffindor student than " + nameSecond.getName());
        } else {
            System.out.println("\n" + nameSecond.getName() + " is a better Gryffindor student than " + nameFirst.getName());
        }
    }

}

