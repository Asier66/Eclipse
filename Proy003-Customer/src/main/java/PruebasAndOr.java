
public class PruebasAndOr {

	public static void main(String [] args) {
		
		Pedido p = new Pedido(2);
		p.setObservaciones("Urgente");
		
		if(p !=null && p.getObservaciones() != null && p.getObservaciones().equals("Urgente")) {
			System.out.println("Envio ya el pedido");
		}else {
			System.out.println("Puede esperar");
		}
	}
	
}
