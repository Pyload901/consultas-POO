public class Laptop extends Articulo {
    public Laptop(){
        super(0,0,"Laptop");
    }
    public Laptop(double precio, int contador, String nombre){
        super(precio, contador, nombre);
    }
    @Override
    public boolean armar() {
        System.out.println("Armado...");
        return true;
    }

}
