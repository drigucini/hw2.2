import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void printStudent(Gryffindor name) {
        System.out.println(name);
    }
    public static void printStudent(Slytherin name) {
        System.out.println(name);
    }
    public static void compareStudents(Gryffindor nameFirst, Gryffindor nameSecond) {
        int first = nameFirst.getHonor() + nameFirst.getNobility() + nameFirst.getCourage();
        int second = nameSecond.getHonor() + nameSecond.getNobility() + nameSecond.getCourage();
        if (first > second) {
            System.out.println(nameFirst.getName() + " is a better Gryffindor student, than " + nameSecond.getName());
        } else {
            System.out.println(nameSecond.getName() + " is a better Gryffindor student, than " + nameFirst.getName());
        }
    }

    public static void compareStudentsPower(Hogwarts firstStudent, Hogwarts secondStudent) {
        int first = firstStudent.getSpellPower() + firstStudent.getTransgressionDistance();
        int second = secondStudent.getSpellPower() + secondStudent.getTransgressionDistance();
        if (first > second) {
            System.out.println(firstStudent.getName() + " is more powerful than " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " is more powerful than " + firstStudent.getName());
        }
    }
    public static void main(String[] args) {
        byte min = 0;
        byte max = 100;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);


        Gryffindor hermione = new Gryffindor("Hermione", "Strange",  1,  randomNum,  4,  4,  4);
        Gryffindor harry = new Gryffindor("Harry", "Potter", 2,  25,  54,  4,  76);
        Gryffindor ron = new Gryffindor("Ron", "Wiesley", 3, 5,  randomNum,  44,  16);

        Slytherin drako = new Slytherin("Drako", "McFloy", 4,  57, 35, 40, 36, 100, 23, 45);
        Slytherin graham = new Slytherin("Graham", "Montegu", 4,  27, 34, randomNum, 36, 18, 23, 55);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", 4,  57, 4, 10, 46, 10, 23, 67);

        printStudent(ron);
        compareStudents(harry, hermione);
        compareStudentsPower(drako,harry);

    }
}