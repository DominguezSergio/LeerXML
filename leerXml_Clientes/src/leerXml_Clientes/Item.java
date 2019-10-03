package leerXml_Clientes;

public class Item {
	private String cliente;
    private String nombre;
    private String telefono;
    private String comentarios;

    


    public String getCliente() {
		return cliente;
	}




	public void setCliente(String cliente) {
		this.cliente = cliente;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getComentarios() {
		return comentarios;
	}




	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}




	@Override
	public String toString() {
		return "Item [id=" + cliente + ", nombre=" + nombre + ", telefono=" + telefono + ", comentarios=" + comentarios
				+ "]";
	}
    
}
