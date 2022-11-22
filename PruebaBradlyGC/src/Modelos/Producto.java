package Modelos;
import java.util.ArrayList;


/**
 * @author bradl
 * @version 1.0
 * @created 22-Nov-2022 3:48:48 PM
 */
public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
        private ArrayList<Producto> ltsProductos = new ArrayList<>();

	public Producto(){

	}

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getLtsProductos() {
        return ltsProductos;
    }

    public void setLtsProductos(ArrayList<Producto> ltsProductos) {
        this.ltsProductos = ltsProductos;
    }
    
    
        
        

	
}//end Producto