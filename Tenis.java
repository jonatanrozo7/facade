class Tenis {
	String marca;
   	String modelo;
	String tipo;

	// 3 objetos de la clase Terreno dentro de Tenis
   	Terreno terreno1 = new Terreno("Asfalto");
	Terreno terreno2 = new Terreno("Montaña");
	Terreno terreno3 = new Terreno("Playa");

	public Tenis(String marca, String modelo, String tipo) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
   	}

	public String getDescripcion() {
        	return marca + " " + modelo + " " + tipo;
	}
	public String getTipo() {
        	return tipo;
    	}
	public Terreno getTerrenoCompatible() {
        	switch (tipo.toLowerCase()) {
        		case "asfalto": return terreno1;
            		case "montaña": return terreno2;
            		case "playa":   return terreno3;
            		default:        return terreno1;
        	}
	}
}