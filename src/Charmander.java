public class Charmander extends Pokemon implements Fire {

    @Override
    protected void  atacatPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacatAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacatMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }

    public Charmander() {
    }

    public Charmander(String gender, String name, int numPokedex, String type, int season, Double weight) {
        super(gender, name, numPokedex, type, season, weight);
    }
}
