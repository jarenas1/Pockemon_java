public class Bulbasaur extends Pokemon implements Plant{
    @Override
    public void atacarParalizar() {
        System.out.println("Soy bulbasur y hago paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy bulbasur y hago drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy bulbasur y hago hoja afilada");

    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy bulbasur y hago latigo cepa");
    }


    @Override
    protected void atacatPlacaje() {

        System.out.println("Soy bulbasur y hago ataque placaje");

    }

    @Override
    protected void atacatAraniazo() {
        System.out.println("Soy bulbasur y hago araniazo");

    }

    @Override
    protected void atacatMordisco() {
        System.out.println("Soy bulbasur y hago mordisco");

    }

    public Bulbasaur() {
    }

    public Bulbasaur(String gender, String name, int numPokedex, String type, int season, Double weight) {
        super(gender, name, numPokedex, type, season, weight);
    }
}
