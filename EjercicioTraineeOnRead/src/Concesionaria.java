
import java.util.ArrayList;
import java.util.Collections;


public class Concesionaria {

    ArrayList<Vehiculo> lista;

    public Concesionaria() {

        this.lista = new ArrayList();
        cargarVehiculos();
    }

    public ArrayList<Vehiculo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Vehiculo> lista) {
        this.lista = lista;
    }

    private void cargarVehiculos() {
        Vehiculo v1 = new Automovil(4, "Peugeot", "206", 200000);
        Vehiculo v2 = new Motocicleta(125, "Honda", "Titan", 60000);
        Vehiculo v3 = new Automovil(5, "Peugeot", "208", 250000);
        Vehiculo v4 = new Motocicleta(160, "Yamaha", "YBR", 80500.5);

        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        lista.add(v4);
    }

    public String vehiculoMasCaro() {

        String resultado = "";
        boolean bandera = false;
        double mayor = 0;
        String vehiculoMasCaro = "";
        for (Vehiculo vehiculo : lista) {
            if (bandera == false) {
                mayor = vehiculo.getPrecio();
                vehiculoMasCaro = vehiculo.getMarca() + " " + vehiculo.getModelo();
                bandera = true;
            }
            if (bandera && mayor < vehiculo.getPrecio()) {
                mayor = vehiculo.getPrecio();
                vehiculoMasCaro = vehiculo.getMarca() + " " + vehiculo.getModelo();
            }
        }
        resultado = "Vehículo más caro: " + vehiculoMasCaro;
        return resultado;
    }

    public String vehiculoMasBarato() {
        String resultado = "";
        boolean bandera = false;
        double menor = 0;
        String vehiculoMasBarato = "";
        for (Vehiculo vehiculo : lista) {
            if (bandera == false) {
                menor = vehiculo.getPrecio();
                vehiculoMasBarato = vehiculo.getMarca() + " " + vehiculo.getModelo();
                bandera = true;
            }
            if (bandera && menor > vehiculo.getPrecio()) {
                menor = vehiculo.getPrecio();
                vehiculoMasBarato = vehiculo.getMarca() + " " + vehiculo.getModelo();
            }
        }
        resultado = "Vehículo más barato: " + vehiculoMasBarato;
        return resultado;
    }

    public String vehiculoQueContenga(String letra) {
        String resultado = "";
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getModelo().contains(letra)) {

                resultado += vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + vehiculo.getPrecioFormateado()+ " ";

            }
        }

        return resultado;
    }

    public ArrayList<Vehiculo> ordenarPorPrecio() {
        ArrayList<Vehiculo> listaLocal = lista;

        Collections.sort(listaLocal);

        return listaLocal;
    }



}
