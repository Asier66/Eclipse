
import java.io.Serializable;
import java.util.Date;
/*
 * Clase entidad
 * Representa los datos de un pedido
 */
public class Pedido implements Serializable{

	//ATRIBUTOS
	private int idPedido;
	private Date fechaPrevia;
	private int idProducto;
	private int cantidad;
	private String observaciones;
	
	public Pedido(int idPedido, Date fechaPrevia, int idProducto, int cantidad, String observaciones) {
		super();
		this.idPedido = idPedido;
		this.fechaPrevia = fechaPrevia;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.observaciones = observaciones;
	}
	
	public Pedido(int idPedido) {
		this(idPedido, new Date (), 0, 0, "");
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPrevia() {
		return fechaPrevia;
	}

	public void setFechaPrevia(Date fechaPrevia) {
		this.fechaPrevia = fechaPrevia;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaPrevia=" + fechaPrevia + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + ", observaciones=" + observaciones + "]";
	}
	
	
	
}
