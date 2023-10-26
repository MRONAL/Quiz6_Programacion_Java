// Clase para el Círculo, que hereda de FiguraGeometrica
class Circulo extends FiguraGeometrica {
    // Atributos específicos de la clase Circulo
    private double radio;  // Radio del círculo

    // Constructor de la clase Circulo que inicializa los atributos de la clase base y los propios.
    // Complejidad temporal: O(1)
    public Circulo(String nombre, String color, double radio) {
        // Llamamos al constructor de la clase base para inicializar nombre y color.
        super(nombre, color);
        // Inicializamos el atributo específico de la clase Circulo.
        this.radio = radio;
    }

    // Métodos específicos de la clase Circulo

    // Método para obtener el área del círculo.
    // Sobreescribe el método de la clase base con una implementación específica para el círculo.
    // Complejidad temporal: O(1)
    @Override
    public double obtenerArea() {
        // Fórmula para calcular el área de un círculo: π * radio^2
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para obtener el perímetro del círculo.
    // Sobreescribe el método de la clase base con una implementación específica para el círculo.
    // Complejidad temporal: O(1)
    @Override
    public double obtenerPerimetro() {
        // Fórmula para calcular el perímetro de un círculo: 2 * π * radio
        return 2 * Math.PI * radio;
    }
}
