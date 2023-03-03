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
            System.out.println("\n" + nameFirst.getName() + " is a better Gryffindor student than " + nameSecond.getName());
        } else {
            System.out.println("\n" + nameSecond.getName() + " is a better Gryffindor student than " + nameFirst.getName());
        }
    }

    public static void compareStudentsPower(Hogwarts firstStudent, Hogwarts secondStudent) {
        int first = firstStudent.getSpellPower() + firstStudent.getTransgressionDistance();
        int second = secondStudent.getSpellPower() + secondStudent.getTransgressionDistance();
        if (first > second) {
            System.out.println("\n" + firstStudent.getName() + " is more powerful than " + secondStudent.getName());
        } else {
            System.out.println("\n" + secondStudent.getName() + " is more powerful than " + firstStudent.getName());
        }
    }
    public static void main(String[] args) {
        byte min = 0;
        byte max = 100;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNum3 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randomNum4 = ThreadLocalRandom.current().nextInt(min, max + 1);


        Gryffindor hermione = new Gryffindor("Hermione", "Granger",  1,  randomNum,  4,  4,  4);
        Gryffindor harry = new Gryffindor("Harry", "Potter", 2,  randomNum1,  randomNum2,  4,  76);
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 3, 5,  randomNum,  44,  16);

        Slytherin draco = new Slytherin("Draco", "Malfoy", 4,  randomNum3, randomNum4, 40, 36, 100, 23, 45);
        Slytherin graham = new Slytherin("Graham", "Montague", 4,  27, 34, randomNum, 36, 18, 23, 55);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", 4,  57, 4, 10, 46, 10, 23, 67);

        Ravenclaw cho = new Ravenclaw("Cho", "Chang", 6, 56, 21, 3, 2, 1, 4);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil", 6, 56, 21, 3, 2, 1, 4);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby", 6, 56, 21, 3, 2, 1, 4);

        Hufflepuff zacharias = new Hufflepuff("Zacharias", "Smith", 95, 27, 78, 23, 76, 45);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", 95, 27, 78, 23, 76, 45);
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley", 95, 27, 78, 23, 76, 45);

        printStudent(ron);
        printStudent(gregory);
        compareStudents(harry, hermione);
        compareStudentsPower(draco,harry);
    }
}