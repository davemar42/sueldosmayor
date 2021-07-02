import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Double sueldoalto=0.0;
        Double sueldomenor=0.0;
        int numero=0;
        int codigo=0;
        int codigoselecc=0;
        int codigomenor=0;

        Double sueldo=0.0;
        int i;
        ArrayList<Double>sueldos=new ArrayList<>();
        Scanner entrada=new Scanner(System.in);

        System.out.println("¿Cuantos alumnos necesita?");
        numero=entrada.nextInt();
        for(i=1;i<=numero;i++){
            System.out.println("codigo?");
            codigo=entrada.nextInt();

            System.out.println("sueldo?");
            sueldo=entrada.nextDouble();
            sueldos.add(sueldo);
            if(i==1){
                sueldoalto=sueldo;
                sueldomenor=sueldo;

            }
            if(sueldo>sueldoalto){
                sueldoalto=sueldo;
                codigoselecc=codigo;
            }
















        }
        System.out.println("Los sueldos son "+sueldos);
        System.out.println("el sueldo mas alto es "+sueldoalto+" del empleado "+codigoselecc);
        //System.out.println("el sueldo menor es "+ sueldomenor+"del empleado" +codigomenor);

    }
}
