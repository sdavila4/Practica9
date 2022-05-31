public class Main {
    public static void main(String[] args) {
        Magnum_Opus opus = new Magnum_Opus();
        R_Cuchillos R1 = new R_Cuchillos();
        R_MCalientes R2 = new R_MCalientes();
        int op;
        int x = 0;
        int accion;
        do{
            op = 0;
            accion = 0;
            do{
                System.out.println("Selecciona al robot ");
                System.out.println("1 - " + opus.getNombre());
                System.out.println("2 - " + R1.getNombre());
                System.out.println("3 - " + R2.getNombre());
                op = CapturaEntrada.capturaEntero("Robot ");
                if(op == 2 && R1.accionrealizada||(op == 3 && R2.accionrealizada)){
                    System.out.println("Ya has seleccionado una tarea para este mini robot.");
                    op = CapturaEntrada.capturaEntero("Robot ");
                }
                System.out.println();
            }while(op<=0||op>=5);
            do{
                System.out.println("Selecciona una accion");
                System.out.println("1 - Ingredientes");
                System.out.println("2 - Cocinar");
                System.out.println("3 - Servir");
                accion = CapturaEntrada.capturaEntero("Accion ");
                if(!(accion == (x+1))){
                    System.out.println("No se pudo realizar la accion");
                    accion = 0;
                }
                System.out.println();
            }while(accion>=4||accion<=0);
            if((op == 2 && accion == 2)||(op==2 && accion == 3)){
                String continuar = CapturaEntrada.capturaCadena("Robot con dos cuchillos no puede realizar la accion, desea continuar?");
                if(continuar.toLowerCase().equals("no"))
                {
                    op = 0;
                    accion = 0;
                }
            }
            if((op == 3 && accion ==1)||(op==3 && accion ==3)){
                String continuar = CapturaEntrada.capturaCadena("Robot para calentar no puede realizar la accion, desea continuar?");
                if(!continuar.toLowerCase().equals("si"))
                {
                    op = 0;
                    accion = 0;
                }
            }
            switch(op){
                case 1:{
                    switch(accion){
                        case 1: {
                            System.out.println(opus.CortarCarne());
                            System.out.println(opus.PicarVerdura());
                            opus.setAccion("Ingredientes");
                            break;
                        }
                        case 2:{
                            System.out.println(opus.CocinarGuiso());
                            opus.setAccion("Cocinar");
                            break;
                        }
                        case 3:{
                            System.out.println(opus.Servir());
                            opus.setAccion("Servir");
                            break;
                        }
                    }
                }
                break;
                case 2:{
                    switch(accion){
                        case 1: {
                            System.out.println(R1.CortarCarne());
                            System.out.println(R1.PicarVerdura());
                            R1.accionEspecial = true;
                            R1.setAccion("Ingredientes");
                            R1.accionrealizada = true;
                            break;
                        }
                        case 2:{
                            System.out.println(R1.CocinarGuiso());
                            R1.accionEspecial = false;
                            R1.setAccion("Cocinar");
                            R1.accionrealizada = true;
                            break;
                        }
                        case 3:{
                            System.out.println(R1.Servir());
                            R1.accionEspecial = false;
                            R1.setAccion("Servir");
                            R1.accionrealizada = true;
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    switch(accion){
                        case 1: {
                            System.out.println(R2.CortarCarne());
                            System.out.println(R2.PicarVerdura());
                            R2.accionEspecial = false;
                            R2.setAccion("Ingredientes");
                            R2.accionrealizada = true;
                            break;
                        }
                        case 2:{
                            System.out.println(R2.CocinarGuiso());
                            R2.accionEspecial = true;
                            R2.setAccion("Cocinar");
                            R2.accionrealizada = true;
                            break;
                        }
                        case 3:{
                            System.out.println(R2.Servir());
                            R2.accionEspecial = false;
                            R2.setAccion("Servir");
                            R2.accionrealizada = true;
                            break;
                        }
                    }
                    break;
                }
            }
            x++;
        }while(accion!=3);

        if(R1.getAccion() == null && R2.getAccion() == null){
        }
        else if(R1.getAccion() != null && R2.getAccion() == null){
            if(R1.accionEspecial == true){
                System.out.println("Buen trabajo, se preparo un platillo excelente!");
            }
            else{
                System.out.println("El platillo quedo regular");
            }
        }
        else if(R1.getAccion() == null && R2.getAccion() != null){
            if(R2.accionEspecial == true){
                System.out.println("Buen trabajo, se preparo un platillo excelente!");
            }
            else{
                System.out.println("El platillo quedo regular");
            }
        }
        else if(R1.accionEspecial == true && R2.accionEspecial == true){
            System.out.println("Buen trabajo, se preparo un platillo excelente!");
        }
        else if((R1.accionEspecial == false && R2.accionEspecial == true)||(R1.accionEspecial == true && R2.accionEspecial == false)){
            System.out.println("El platillo quedo regular");
        }
        else if(R1.accionEspecial == false && R2.accionEspecial == false){
            System.out.println("El platillo sabe mal");
        }
        opus.Imprimir();
        R1.Imprimir();
        R2.Imprimir();
    }
}