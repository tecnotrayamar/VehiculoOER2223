
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoOER2223 miVehiculoOER2223;
        int stockActual;
        
        miVehiculoOER2223 = new VehiculoOER2223("Seat",18000,100);
        operativaVehiculosOER2223(miVehiculoOER2223, 50); 
        stockActual = miVehiculoOER2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosOER2223(VehiculoOER2223 miVehiculoOER2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoOER2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoOER2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
