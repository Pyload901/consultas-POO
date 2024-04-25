public class Telefono extends Articulo{
    public Telefono() {
        super(0,0, "Telefono");
    }

    public Telefono(double precio, int contador, String nombre) {
        super(precio, contador, nombre);
    }

    @Override
    public boolean armar() {
        System.out.println("Armando telefono...");
        return true;
    }

}
