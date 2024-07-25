public class Main {
    public static void main(String[] args) {

        //CREACION DE OBJETOS

        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();

        //verificamos que si se esten usando bien los metodos
        charmander.atacatAraniazo();
        pikachu.atacatAraniazo();
        bulbasaur.atacatAraniazo();
        squirtle.atacatAraniazo();
    }
}