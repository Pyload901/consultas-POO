public class Main {
     public static void main (String[] args){
         Laptop laptop = new Laptop(200,2, "HP Laptop");
         Telefono telefono = new Telefono();

         vender(laptop);
         vender(telefono);

         laptop.armar();
         telefono.armar();


     }

     public static void vender(Vendible objeto){
         if (objeto.vender()){
             System.out.println("El objeto " + objeto.getDescripcion() + " fue vendido exitosamente");
         } else {
             System.out.println("No se pudo vender " + objeto.getDescripcion());
         }

     }
}
