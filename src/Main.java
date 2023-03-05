import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static int giveRandom() {
        byte min = 0;
        byte max = 100;
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static void main(String[] args) {

        GryffindorStudent hermione = new GryffindorStudent("Hermione", "Granger",  giveRandom(),  giveRandom(),  giveRandom(), giveRandom(), giveRandom());
        GryffindorStudent harry = new GryffindorStudent("Harry", "Potter", giveRandom(),  giveRandom(),  giveRandom(), giveRandom(), giveRandom());
        GryffindorStudent ron = new GryffindorStudent("Ron", "Weasley", giveRandom(), giveRandom(),  giveRandom(), giveRandom(), giveRandom());

        SlytherinStudent draco = new SlytherinStudent("Draco", "Malfoy", giveRandom(),  giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());
        SlytherinStudent graham = new SlytherinStudent("Graham", "Montague", giveRandom(),  giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());
        SlytherinStudent gregory = new SlytherinStudent("Gregory", "Goyle", giveRandom(),  giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());

        RavenclawStudent cho = new RavenclawStudent("Cho", "Chang", giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());
        RavenclawStudent padma = new RavenclawStudent("Padma", "Patil", giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());
        RavenclawStudent marcus = new RavenclawStudent("Marcus", "Belby", giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());

        HufflepuffStudent zacharias = new HufflepuffStudent("Zacharias", "Smith", giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());
        HufflepuffStudent cedric = new HufflepuffStudent("Cedric", "Diggory", giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());
        HufflepuffStudent justin = new HufflepuffStudent("Justin", "Finch-Fletchley", giveRandom(), giveRandom(), giveRandom(), giveRandom(), giveRandom());

        GryffindorStudent.printStudent(ron);
        SlytherinStudent.printStudent(gregory);
        RavenclawStudent.printStudent(cho);
        HufflepuffStudent.printStudent(zacharias);

        GryffindorStudent.compareStudents(harry, hermione);
        SlytherinStudent.compareStudents(graham, gregory);
        RavenclawStudent.compareStudents(padma, marcus);
        HufflepuffStudent.compareStudents(cedric, justin);

        HogwartsStudent.compareStudentsPower(draco,harry);
        HogwartsStudent.compareStudentsPower(cho,justin);
        HogwartsStudent.compareStudentsPower(zacharias,cedric);
    }
}