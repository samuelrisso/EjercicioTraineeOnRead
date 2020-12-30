import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        
        Concesionaria c = new Concesionaria();
        ArrayList<Vehiculo> lista = c.getLista();


        for (Vehiculo vehiculo : lista) {
            System.out.println(vehiculo.toString());
        }
        System.out.println("=============================");
        System.out.println(c.vehiculoMasCaro());
        System.out.println(c.vehiculoMasBarato());
        String letra = "Y";
        System.out.println("Vehículo que contiene en el modelo la letra " + letra + ": " + c.vehiculoQueContenga(letra));

        ArrayList<Vehiculo> listaOrdenada = c.ordenarPorPrecio();
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Vehiculo vehiculo : listaOrdenada) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
        }

        
    }
    


}
