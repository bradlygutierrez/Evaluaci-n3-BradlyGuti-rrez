package Modelos;

/**
 * @author bradl
 * @version 1.0
 * @created 22-Nov-2022 3:49:45 PM
 */
public class Factura {

	private int codigo;
	private Date fecha;
	public Producto m_Producto;
	public Vendedor m_Vendedor;
        public Cliente m_cliente;
        private ArrayList
        
                
	public Factura(){

	}
	public void finalize(){

	}

	public factura(){

	}

	/**
	 * 
	 * @param List<Producto>
	 */
	public double calcTotal(List<Producto> List<Producto>){
		return 0;
	}

	/**
	 * 
	 * @param double
	 * @param doubleb
	 */
	public double aplicarIVA(double precio, double b){
                double precioConIva;
                precioTotal = precio + (precio * 0.15);
		return precioConIva;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 */
	public double calcMonto(double a, double b){
		return 0;
	}

	/**
	 * 
	 * @param prod
	 */
	public void agregarProducto(Producto prod){
            m_Producto.getLtsProductos().add(prod);
	}

    public Factura(int codigo, Date fecha, Producto m_Producto, Vendedor m_Vendedor, Cliente m_cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.m_Producto = m_Producto;
        this.m_Vendedor = m_Vendedor;
        this.m_cliente = m_cliente;
        this.doubleb = doubleb;
    }
        
        
}//end Factura