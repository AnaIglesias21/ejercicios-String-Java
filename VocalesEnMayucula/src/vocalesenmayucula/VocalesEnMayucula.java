/*
 * Programa que pone en mayúscula las vocales de una frase
 */
package vocalesenmayucula;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class VocalesEnMayucula {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        char[] charFrase, charFraseCambio;
        
        String frase = pedirFrase();
        //cargamos el array con la frase
        charFrase = frase.toCharArray();
        //inicializamos el array que va a contenr la frase cambiada
        charFraseCambio = new char[charFrase.length];
        //cargamos el array con la frase cambiada
        charFraseCambio = cambiarFrase(charFrase);
        //visualizamos la frase cambiada
        System.out.print("\nFrase cambiada: ");
        for (char c:charFraseCambio){
            System.out.print(c);
        }
        
        System.out.println();
        entrada.close();
        
    }
    
    private static String pedirFrase(){
        String frase = "";
        
        do{
           
            System.out.print("Frase: ");
            frase = entrada.nextLine();
            //aseguramos que se introduzcan caracteres que no sean números
            if (!frase.matches("[\\D]+")){
                System.out.println("Frase errónea. No puede estar vacía ni contener dígitos.");
                frase = "";
            }
            
        }while(frase.isEmpty());
        
        return frase;
    }

    private static char[] cambiarFrase(char[] charFrase) {
        char[] cambio = new char[charFrase.length];
        
        for (int i=0;i<charFrase.length;i++){
            if (charFrase[i] == 'a' || charFrase[i] == 'e' || charFrase[i] == 'i' || charFrase[i] == 'o' || charFrase[i] == 'u'){
                cambio [i] = Character.toUpperCase(charFrase[i]);
            }else{
                cambio [i] = charFrase[i];
            }
        }
        return cambio;
    }
}
