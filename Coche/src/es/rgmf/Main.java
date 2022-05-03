package es.rgmf;

public class Main {
    public static void main(String[] args) {
        Coche ford = new Coche("Ford", "Focus", "rojo");

        System.out.println(ford);

        ford.incrementarVelocidad(5);

        System.out.println(ford);
    }
}
