//TiposDeDatos.java
void main(){
    int edad=18; //entero
    double estatura=1.75; //real
    char inicial='G'; //caracter
    string nombre="Gabriela"; //caracter (cadena)
    boolean esAlumno=true; //logico

    IO.println(nombre+"tiene"+edad+"años");
}

void main(){
    double base= double.parsedouble(IO.readln("da,e la base:"));
    double altura= double.parsedouble(IO.readln("dame la altura:"));
    double area= base*altura;
    IO.println("El área es:"+area);
}

void main(){
    double c1=double.parsedouble(IO.readln("calificación 1:"));
    double c2=double.parsedouble(IO.readln("calificación 2:"));
    double c3=double.parsedouble(IO.readln("calificación 3:"));
    double promedio=(c1+c2+c3)/3;
    IO.println("El promedio es:"+promedio);
}

void main(){
    int edad=integer.parseint(IO.readln("dame tu edad:"));
    boolean enRango=(edad>=18)&&(edad<=24);
    IO.println("¿Está en el rango de 18 a 24 años? "+enRango);
}