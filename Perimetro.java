import java.io.*;


public class Perimetro {

   
    public static void main(String[] args) throws IOException 
    {
        int area;
        System.out.println("Ingrese el area del cuadrado en metros cuadrados");
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        area = Integer.parseInt(bufEntrada.readLine());
        float Perimetro =(float) Math.sqrt(area);
        System.out.println("El perimetro del area es: " + Perimetro);
    }    
}
