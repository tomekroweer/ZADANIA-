public class Osoba {

    int ileRazy;

    String name;
    int age;
    boolean isAlive;
    boolean isWorking;

    void przedstawSie(boolean formal) {
        ileRazy++;
        if (formal) {
        System.out.println("Witam Państwa bardzo serdecznie. " + " Mam na imię " + name + " mam " + age + " lat ");
    } else

    {
        System.out.println("Cześć jestem " + name + " mam " + age + " lat ");
    }
    }
    int ileRazyPrzedstawili() {
        return ileRazy;
    }
}
