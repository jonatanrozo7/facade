public class Principal {
    public static void main(String[] args) {

        Tenis tenis1 = new Tenis("Nike", "Pegasus", "Montaña");
    	Tenis tenis2 = new Tenis("Adidas", "Ultraboost", "Asfalto");
   	Tenis tenis3 = new Tenis("Puma", "Velocity Nitro", "Playa");

	Atleta atleta1 = new Atleta("Paula", 28, 200,tenis1);
        Atleta atleta2 = new Atleta("Juan", 30, 100,tenis2);
        Atleta atleta3 = new Atleta("Ana", 25, 110,tenis3);
	
	

        SesionEntrenamientoFacade sesion = new SesionEntrenamientoFacade();

        // ===== ATLETA 1 =====
        System.out.println("=== INFORMACIÓN DE LOS ATLETA1 ===");
        atleta1.mostrarSoloTenis();

        Tenis tenisElegido1 = atleta1.tenis;
        Terreno terrenoElegido1 = tenisElegido1.getTerrenoCompatible();

        sesion.ejecutarSesion(
                atleta1,
                tenisElegido1,
                terrenoElegido1,
                terrenoElegido1.duracionCorta,
                terrenoElegido1.duracionCorta.hidratacionMucha
        );

        // ===== ATLETA 2 =====
        System.out.println("\n=== INFORMACIÓN DE LOS ATLETA2 ===");
        atleta2.mostrarSoloTenis();

        Tenis tenisElegido2 = atleta2.tenis;
        Terreno terrenoElegido2 = tenisElegido2.getTerrenoCompatible();

        sesion.ejecutarSesion(
                atleta2,
                tenisElegido2,
                terrenoElegido2,
                terrenoElegido2.duracionMedia,
                terrenoElegido2.duracionMedia.hidratacionNormal
        );

        // ===== ATLETA 3 =====
        System.out.println("\n=== INFORMACIÓN DE LOS ATLETA3 ===");
        atleta3.mostrarSoloTenis();

        Tenis tenisElegido3 = atleta3.tenis;
        Terreno terrenoElegido3 = tenisElegido3.getTerrenoCompatible();

        sesion.ejecutarSesion(
                atleta3,
                tenisElegido3,
                terrenoElegido3,
                terrenoElegido3.duracionLarga,
                terrenoElegido3.duracionLarga.hidratacionNinguna
        );
    }
}