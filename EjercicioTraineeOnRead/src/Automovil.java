


public class Automovil extends Vehiculo {

    private int cantidadPuertas;

    public Automovil(int cantidadPuertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }



    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {

        return "Marca: " + super.getMarca() + " // " + "Modelo: " + super.getModelo() + " // " + "Puertas: " + this.cantidadPuertas + " // " + super.getPrecioFormateado();
    }

}
