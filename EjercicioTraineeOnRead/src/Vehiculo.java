
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    private String marca;
    private String modelo;
    private double precio;
    private String precioFormateado;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        formatearPrecio();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPrecioFormateado() {
        return precioFormateado;
    }

    public void setPrecioFormateado(String precioFormateado) {
        this.precioFormateado = precioFormateado;
    }
    

    @Override
    public int compareTo(Vehiculo v) {
        int respuesta = 0;
        if (v.getPrecio() > precio) {
            respuesta = 1;
        } else if (v.getPrecio() < precio) {
            respuesta = -1;
        } else {
            respuesta = 0;
        }

        return respuesta;
    }
    private void formatearPrecio(){
        Locale region = Locale.getDefault();
        NumberFormat formateador = NumberFormat.getCurrencyInstance(region);
        
        this.precioFormateado = formateador.format(this.precio);
    }

}
