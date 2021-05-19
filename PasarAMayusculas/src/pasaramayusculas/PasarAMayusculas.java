package pasaramayusculas;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class PasarAMayusculas {

    private static String frase;
    private static char[] charFrase;
    private static char[] charFraseMayuscula;
    static  Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        frase = pedirFrase();
        System.out.println("Frase correcta: "+frase);
        charFrase = frase.toCharArray();
        charFraseMayuscula = new char[charFrase.length];
        //for (char c:charFrase){
        for (int i=0;i<charFrase.length;i++){
            System.out.print(charFrase[i]+" ");
            if (Character.isLowerCase(charFrase[i])){
                charFraseMayuscula[i] = Character.toUpperCase(charFrase[i]);
            }else{
                charFraseMayuscula[i] = charFrase[i];
            }
            
        }
        System.out.print("\nFrase en mayúsculas: ");
        //visulaizamos el array de mayusculas
        for (char c:charFraseMayuscula){
            System.out.print(c);
        }
        System.out.println();
        //String fraseMayuscula = frase.toUpperCase();
        //System.out.println("\nFrase en mayúsculas: "+ frase.toUpperCase());
        entrada.close();
    }

    private static String pedirFrase() {
        String frase = "";
        do{
            System.out.print("Frase: "); 
            frase = entrada.nextLine();
            if (!frase.matches("[\\D]+")){
                System.out.println("Debes introducir una frase");
                frase = "";
            }
            
        }while(frase.isEmpty());
        
        return frase;
    }
    
}
