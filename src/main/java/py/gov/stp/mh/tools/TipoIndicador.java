package py.gov.stp.mh.tools;
/**
 * @author		DGTIC-STP
 * @email		dgtic@stp.gov.py 
 *
 **/
public class TipoIndicador {
	
	protected int id;
	protected String nombre;
	protected String descripcion;
	protected boolean borrado;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isBorrado() {
		return borrado;
	}
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	
}