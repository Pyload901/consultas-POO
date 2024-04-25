public abstract class Articulo implements Vendible{
    private String nombre;
    private double precio;
    private int contador = 0;

    //C
    public Articulo(){}
    public Articulo(double precio, int contador, String nombre){
        this.precio = precio;
        this.contador = contador;
        this.nombre = nombre;
    }
    //m

    //gys

    public abstract boolean armar();

    @Override
    public boolean vender() {
        if (contador > 0){
            System.out.println("Vendido...");
            return true;
        }
        return false;
    }

    public double getPrecio(){
        return precio;
    }
     public void setPrecio(double precio){
        this.precio = precio;
     }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getDescripcion() {
        return nombre;
    }

    public void setDescripcion(String nombre) {
        this.nombre = nombre;
    }
}
