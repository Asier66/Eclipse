import java.util.Date;

public class PruebasPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedido p= new Pedido(1);
		
		p.setCantidad(10);
		p.setIdProducto(45);
		p.setFechaPrevia(new Date());
		p.setObservaciones("urge");
		
		System.out.println(p);
		
		Pedido p2 = p;
		System.out.println(p2);
		System.out.println(p2.getIdPedido());
		
		
	}

}
