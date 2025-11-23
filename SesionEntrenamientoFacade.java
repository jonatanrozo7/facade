class SesionEntrenamientoFacade {

    public void ejecutarSesion(Atleta atleta, Tenis tenis, Terreno terreno,
                               Duracion duracion, Hidratacion hidratacion) {

        atleta.correr(tenis, terreno);
        duracion.aplicarDuracion(atleta);
        hidratacion.hidratar(atleta);

        System.out.println("Sensación del atleta: " + hidratacion.getSensacion());
        System.out.println("Energía restante del atleta: " + atleta.getEnergia());
	if (atleta.getEnergia() > 0) {
    		System.out.println("Terminó la carrera");
	} 	else {
    		System.out.println("No terminó la carrera");
		}
    	}
}