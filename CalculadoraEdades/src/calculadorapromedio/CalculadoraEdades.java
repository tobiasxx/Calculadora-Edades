package calculadorapromedio;
import java.util.Scanner;

public class CalculadoraEdades {
    private int edades[];
    
    public CalculadoraEdades(int[] edades) {  
        this.edades = edades;
    }
    public double CalculadoraPromedioMenoresEdades (){
        int sumaMenores=0;
        int cantMe=0;
        for(int edad:edades){
            if (edad<18){
                sumaMenores=edad+sumaMenores;
                cantMe++;
            }
        }
        return sumaMenores/cantMe;
    }
    public double CalculadoraPromedioMayoresEdades (){ 
        int suma = 0;
        int cantMa = 0;
        for(int edad:edades){
            if (edad>17){
                suma = edad + suma;
                cantMa++;
            }
        }
        return suma/cantMa;   
    } 
  
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de personas: ");
        int c=sc.nextInt();
        int[] edades = new int[c];
        for (int x = 0; x <c; x++) {
            System.out.print("Ingrese su edad: ");
            edades[x]=sc.nextInt();
        }
        CalculadoraEdades calculadora = new CalculadoraEdades(edades);
        System.out.println("Promedio de los mayores de edad: " + calculadora.CalculadoraPromedioMayoresEdades());
        System.out.println("Promedio de los menores de edad: " + calculadora.CalculadoraPromedioMenoresEdades());
        sc.close();
    }
}
