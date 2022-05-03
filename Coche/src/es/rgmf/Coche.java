package es.rgmf;

public class Coche {
    String tipo;
    String modelo;
    String color;
    int velocidad;

    Coche() {
        tipo = "Desconocido";
        modelo = "Desconocido";
        color = "Desconocido";
        velocidad = 0;
    }

    Coche(String tipo, String modelo, String color) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    int incrementarVelocidad(int incremento) {
        velocidad += incremento;
        return velocidad;
    }

    void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }
}
