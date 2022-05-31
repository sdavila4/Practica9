public abstract class Robot {
    private int bateria;
    public String nombre;
    public int id;
    private String accion;

    public Robot(){
        //System.out.println("Bienvenido a Magnum Opus, el primer robot chef funcional");
        setNombre(CapturaEntrada.capturaCadena("Ingresa el nombre del mini robot"));
        setBateria(CapturaEntrada.capturaEntero("Porcentaje de bateria"));
        setIdenti(CapturaEntrada.capturaEntero("ID"));
    }
    public void setBateria(int nivel){
        bateria = nivel;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIdenti(int id){
        this.id = id;
    }
    public void setAccion(String acion){
        accion = acion;
    }

    public int getBateria(){
        return bateria;
    }
    public String getNombre(){
        return nombre;
    }
    public int getId(){
        return id;
    }
    public String getAccion(){
        return accion;
    }
    public void Imprimir(){
        System.out.println("ID de " + nombre  + id);
        System.out.println("Bateria: " + bateria);
        System.out.println("Ultima accion: " + accion);
    }
}