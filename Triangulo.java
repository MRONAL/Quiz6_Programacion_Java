// Clase para el Triángulo, que hereda de FiguraGeometrica
class Triangulo extends FiguraGeometrica {
    // Atributos específicos de la clase Triangulo
    private double base;   // La base del triángulo
    private double altura; // La altura del triángulo

    // Constructor de la clase Triangulo que inicializa los atributos de la clase base y los propios.
    // Complejidad temporal: O(1)
    public Triangulo(String nombre, String color, double base, double altura) {
        // Llamamos al constructor de la clase base para inicializar nombre y color.
        super(nombre, color);
        // Inicializamos los atributos específicos de la clase Triangulo.
        this.base = base;
        this.altura = altura;
    }

    // Métodos específicos de la clase Triangulo

    // Método para obtener el área del triángulo.
    // Sobreescribe el método de la clase base con una implementación específica para el triángulo.
    // Complejidad temporal: O(1)
    @Override
    public double obtenerArea() {
        // Fórmula para calcular el área de un triángulo: (base * altura) / 2
        return 0.5 * base * altura;
    }

    // Método para obtener el perímetro del triángulo.
    // Sobreescribe el método de la clase base con una implementación específica para el triángulo.
    // Complejidad temporal: O(1)
    @Override
    public double obtenerPerimetro() {
        // Fórmula para calcular el perímetro de un triángulo
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}
