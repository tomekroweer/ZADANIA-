public class Main {
    public static void main(String[] args) {
       Osoba pawel = new Osoba();
       pawel.name = "Paweł";
       pawel.age = 18;
       pawel.isAlive = true;
       pawel.isWorking = true;

       Osoba mikolaj = new Osoba();
       mikolaj.name = "Mikołaj";
       mikolaj.age = 100;
       mikolaj.isAlive = false;

       mikolaj.przedstawSie(false);
       pawel.przedstawSie(false);
       mikolaj.przedstawSie(true);

       int ileRazy = pawel.ileRazyPrzedstawili();

       System.out.println("Paweł przedstawił się " + ileRazy + " raz(y)");
       System.out.println("Mikołaj przedstawił się " + mikolaj.ileRazyPrzedstawili()
       + " raz(y)");
    }
}
