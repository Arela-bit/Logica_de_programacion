public class variables {
public static void main(String[] args) {
     
    int horas_total = 0;
    int faltas =0;
    double sancion = 0;
    double bono = 0;
    double sueldo_neto = 0;

    String nombre = IO.readln("Nombre del empleado: ");
    int pago_x_hora = Integer.parseInt(IO.readln("Cuál es su pago por hora?: "));

    for (int i =1; i <= 6; i++) {
        int horas = Integer.parseInt(IO.readln("Cuántas horas trabajó el día " + i + "?: "));
        if (horas>0) {
            horas_total = horas_total + horas;
         } else {
             faltas = faltas + 1;
         }
    }

    double sueldo_bruto = horas_total * pago_x_hora;
    IO.println ("Trabajaste " + horas_total + " horas en total");
    IO.println("tu sueldo bruto es de: " + sueldo_bruto);

    if (faltas > 0) {
        sancion = sueldo_bruto * 0.1;
        sueldo_neto = sueldo_bruto - sancion;
    IO.println("Tienes una sanción del 10%, tu sueldo neto es de: " + sueldo_neto );}
else if (horas_total > 40) {
    bono = sueldo_bruto * 0.15;
    sueldo_neto = sueldo_bruto + bono;
    IO.println("Tienes un bono del 15%, tu sueldo neto es de: " + sueldo_neto);}
    else{
        IO.println("No hay bono ni sanción, tu sueldo neto es de: " + sueldo_bruto);
    }
}
}