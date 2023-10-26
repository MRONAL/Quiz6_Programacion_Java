public class FiguraGeometrica {
    // Atributos
    private String nombre;  // Nombre de la figura
    private String color;   // Color de la figura

    // Constructor
    // Complejidad temporal: O(1)
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Métodos

    // Método para obtener el área de la figura.
    // En la clase base, proporcionamos una implementación predeterminada que devuelve 0.0.
    // Complejidad temporal: O(1)
    public double obtenerArea() {
        // Implementación predeterminada para calcular el área general.
        return 0.0;
    }

    // Método para obtener el perímetro de la figura.
    // En la clase base, proporcionamos una implementación predeterminada que devuelve 0.0.
    // Complejidad temporal: O(1)
    public double obtenerPerimetro() {
        // Implementación predeterminada para calcular el perímetro general.
        return 0.0;
    }

    // Getters y setters

    // Getter para obtener el nombre de la figura.
    // Complejidad temporal: O(1)
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre de la figura.
    // Complejidad temporal: O(1)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el color de la figura.
    // Complejidad temporal: O(1)
    public String getColor() {
        return color;
    }

    // Setter para establecer el color de la figura.
    // Complejidad temporal: O(1)
    public void setColor(String color) {
        this.color = color;
    }
}


