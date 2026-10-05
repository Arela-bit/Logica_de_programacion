public class IMC {
    public static void main(String[] args) {

        do {

            double peso = Double.parseDouble(IO.readln("Ingrese su peso en kg: "));
            double altura = Double.parseDouble(IO.readln("Ingrese su altura en metros: "));

            double imc = peso / (altura * altura);

            IO.println("Su índice de masa corporal es: " + imc);

            if (imc < 18.5) {
                IO.println("Bajo peso");
                IO.println("Deberias cuidar no descuidar tu alimentación, procura comer tres veces al dia y no saltar comidas");
            } else if (imc >= 18.5 && imc < 24.9) {
                IO.println("Peso normal");
            } else if (imc >= 25 && imc < 29.9) {
                IO.println("Sobrepeso");
            } else if (imc >= 30 && imc < 34.9) {
                IO.println("Obesidad grado 1");
                IO.println("Deberias buscar mejorar tu alimentación y ejercitarte almenos 30 minutos al dia, 5 veces a la semana");
            } else if (imc >= 35 && imc < 39.9) {
                IO.println("Obesidad grado 2");
                IO.println("Consulta un profesional de la salud para recibir un plan personalizado, y que te indique alguna actividad física, echale gaanas hijo!");
            } else {
                IO.println("Obesidad grado 3");
                IO.println("A este punto... acude a un profesional y busca la opción de una manga gastrica, pero no dejes que tus viejos habitos vuelvan!!!");
            } 
        } while (IO.readln("Desea calcular otro IMC? (s/n): ").equalsIgnoreCase("s"));
    }
}