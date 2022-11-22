package Modelos;


/**
 * @author bradl
 * @version 1.0
 * @created 22-Nov-2022 3:48:48 PM
 */
public class Cliente {

	private int codigo;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String email;
	public Factura m_Factura;

	public Cliente(){

	}
	public void finalize(){

	}

    public Cliente(int codigo, String nombres, String apellidos, String direccion, String telefono, String email, Factura m_Factura) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.m_Factura = m_Factura;
    }

        
}//end Cliente