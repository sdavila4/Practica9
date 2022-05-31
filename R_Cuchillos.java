public class R_Cuchillos extends Robot implements Acciones{
    public boolean accionrealizada = false;
    public boolean accionEspecial;
    public R_Cuchillos(){
        super();
    }
    public String CortarCarne(){
        accionrealizada = true;
        return ("Soy Mini Robot de dos cuchillos " + nombre + " y puedo cortar");
    }
    public String PicarVerdura(){
        accionrealizada = true;
        return ("Soy Mini Robot de dos cuchillos " + nombre + " y puedo picar verduras");
    }
    public String CocinarGuiso(){
        accionrealizada = true;
        return ("Soy Mini Robot de dos cuchillos " + nombre +" y trate de cocinar");
    }
    public String Servir(){
        accionrealizada = true;
        return ("Soy Mini Robot de dos cuchillos " + nombre +" y trate de servir la comida");
    }
}
