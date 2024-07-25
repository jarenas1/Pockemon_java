public abstract class Pokemon {
    private int numPokedex;
    private String name;
    private Double weight;
    private String gender;
    private int season;
    private String type;

    public Pokemon() {
    }

    public Pokemon(String gender, String name, int numPokedex, String type, int season, Double weight) {
        this.gender = gender;
        this.name = name;
        this.numPokedex = numPokedex;
        this.type = type;
        this.season = season;
        this.weight = weight;

    }

    //AÑADIMOS FUNCIONALIDADES COMUNES DE LOS POKEMONES EN METODOS ABSTRACTOS PARA QUE CADA POKEO¿MON LO IMPLEMENTE A SU MANERA

    //RECORDAR QUE UN METODO ABSTRACTO NOS DICE QUE SE VA A HACER PERO NO COMO SE VA A HACER, CUANDO SE IMPLEMENTA ES CUANDO SE DICE COMO SE HACE

    protected abstract void atacatPlacaje();
    protected abstract void atacatAraniazo();
    protected abstract void atacatMordisco();

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}



