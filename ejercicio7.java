import java.util.Scanner;

public class ejercicio7{
    public static void main(String[] args) {
        double kilos, consumo, resultado;
        
        System.out.print("Bienvenido" + "\n" + "Digite la cantidad de kilos que desea transportar a Sasaima: ");
        Scanner teclado = new Scanner(System.in);
        kilos = teclado.nextDouble();
        
        //Tomamos como base que el camion puede transportar 500 Kl por viaje
        resultado = Math.ceil(kilos / 500);
        System.out.print("El numero de viajes para transportar " +  kilos + " Kilos a Sasaima es: " +  resultado + "\n");
        
        //Tomamos como base que el camion consume 0,5 galones de gasolina por kilometro y que de Bogota a Sasaima hay 50 km
        consumo = 50 * 0.5;
        
        System.out.print("El numero de galones consumidos por viaje es " +  consumo + " galones de gasolina " + "\n");
        
        resultado = resultado * consumo;
        
        resultado = (resultado * 10000) * 2; //teniedo en cuenta que debe de hacer ida y regreso
        
        System.out.print("El precio de la gasolina consumida es $" +  resultado + " Pesos " + "\n");
        
    }
}