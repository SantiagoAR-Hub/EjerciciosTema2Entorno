public class OperadoresRelacionales {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println("Módulo: " + (a % b));

    


        int num1 = 30;
        int num2 = 50;
        
        if (num1>num2) {
        System.out.println("El primer numero es mayor que el segundo");
    }
        else if (num1<num2){
        System.out.println("El primer numero es menos que el segundo");
    }
        else {
            System.out.println("Ambos numeros son iguales");
        }



        int edad = 50;
        boolean esCiudadano = true;
        if (edad >= 18 && esCiudadano) {
            System.out.println("es elegible para votar");
            
        } else {
            System.out.println("No es elegible para votar");
            
        }


        int numero = 245;
        String resultado = (numero % 2 ==0) ? "par" : "impar";
        System.out.println("El numero es " + resultado + ".");


        int x = 45;
        x += 10;
        System.out.println("x += 10: " + x);
        x -= 15;
        System.out.println("x -= 15: " + x);
        x *= 6;
        System.out.println("x *= 6: " + x);
        x /= 8;
        System.out.println("x /= 8: " + x);
        x %= 3;
        System.out.println("x %= 3: " + x);

    }
}    