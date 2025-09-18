public class Animal {

    //Atributos clase

    private String nombre;
    private String especie;
    private double tamano;
    private String genero;

    //CONSTRUCTOR VACIO

    public Animal () {
    }

    // CONSTRUCTOR CON PARAMETROS

    public Animal(String nombre, String especie, double tamano, String genero) {
        this.nombre = nombre;
        this.especie = especie;
        this.tamano = tamano;
        this.genero = genero;
    }

    // CONSTRUCTOR CON NOMBRE Y GENERO


    public Animal(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // GETTER Y SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", tamano=" + tamano +
                ", genero='" + genero + '\'' +
                '}';
    }

    // METODOS PROPIOS

    public String calcularTamano(double t) {
        if (t>5) {
            return "ANIMAL GRANDE";
        } else if (t<=54 && t>=3) {
            return "ANIMAL MEDIANO";
        }else if (t<3) {
            return "ANIMAL PEQUEÑO";
        }
    }


}




