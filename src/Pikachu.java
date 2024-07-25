public class Pikachu extends Pokemon implements Electric{

//IMPLEMENTAMOS TODOS LOS METODOS ABSTRACTOS

    //ELECTRIC
    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy pikachu y hago impacto trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy pikachu y hago punio trueno");

    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy pikachu y hago rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy pikachu y hago rayo carga");

    }

    //POKEMON

    @Override
    protected void atacatPlacaje() {

        System.out.println("Soy pikachu y hago ataque placaje");

    }

    @Override
    protected void atacatAraniazo() {
        System.out.println("Soy pikachu y hago araniazo");

    }

    @Override
    protected void atacatMordisco() {
        System.out.println("Soy pikachu y hago mordisco");

    }

    public Pikachu() {
    }

}
