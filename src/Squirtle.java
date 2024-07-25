public class Squirtle extends Pokemon implements Water{

    @Override
    protected void atacatPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacatAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacatMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtle y este es mi hidro impulso");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque pistola agua");
    }

    public Squirtle() {
    }

    public Squirtle(String gender, String name, int numPokedex, String type, int season, Double weight) {
        super(gender, name, numPokedex, type, season, weight);
    }
}
