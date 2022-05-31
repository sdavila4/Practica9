public class Magnum_Opus extends Robot implements Acciones{
    public Magnum_Opus(){
        super();
    }
    public String CortarCarne(){
        return ("Soy Magum Opus " + nombre + " y puedo cortar");
    }
    public String PicarVerdura(){
        return ("Soy Magum Opus " + nombre + " y puedo picar verduras");
    }
    public String CocinarGuiso(){
        return ("Soy Magum Opus " + nombre +" y puedo cocinar");
    }
    public String Servir(){
        return ("Soy Magum Opus " + nombre +" y puedo servir la comida");
    }
}