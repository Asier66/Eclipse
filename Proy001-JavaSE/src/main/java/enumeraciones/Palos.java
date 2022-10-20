package enumeraciones;

public enum Palos {
	
	OROS, BASTOS, COPAS, ESPADAS, COMODIN

}

enum ModelosCoche{
	BASICO("Solo tiene motor y ruedas"),
	MEDIO("Tiene Aire Acondicionado"),
	SUPERIOR("Con Navegador");
	
	//ATRIBUTOS
	private String descripcion;
	
	//CONTRUCTORES
	
	private ModelosCoche(String s) {
		this.descripcion =s;
	}
	//METODOS
	
	public String getDescripcion() {
		return descripcion;
	}
}
