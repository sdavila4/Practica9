public class R_MCalientes extends Robot implements Acciones{
    public boolean accionrealizada = false;
    public boolean accionEspecial;
    public R_MCalientes(){
        super();
    }
    public String CortarCarne(){
        accionrealizada = true;
        return ("Soy Mini Robot de manos calientes " + nombre + " y trate de cortar carne");
    }
    public String PicarVerdura(){
        accionrealizada = true;
        return ("Soy Mini Robot de manos calientes " + nombre + " y trate de picar verduras");
    }
    public String CocinarGuiso(){
        accionrealizada = true;
        return ("Soy Mini Robot de manos calientes " + nombre +" y puedo cocinar");
    }
    public String Servir(){
        accionrealizada = true;
        return ("Soy Mini Robot de manos calientes " + nombre +" y trate de servir la comida");
    }
}