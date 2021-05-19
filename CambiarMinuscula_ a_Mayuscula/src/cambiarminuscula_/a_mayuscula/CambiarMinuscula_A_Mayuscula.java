package cambiarminuscula_.a_mayuscula;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class CambiarMinuscula_A_Mayuscula {

    static char[] charFrase, charFraseCambio;
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        //pedimos la frase al usuario
        String frase = pedirFrase();
        System.out.println("Frase correcta:  "+frase);
        
        //pasmos la frase a un array
        charFrase = frase.toCharArray();
        //inicializamos el arrayDel cambio
        charFraseCambio = new char[charFrase.length];
        
        //cambiamos las mayúsculas por minúsculas
        charFraseCambio = cambiar(charFrase);
        System.out.println("\nFrase cambiando minúsculas por mayúsculas:");
        for (char c:charFraseCambio){
            System.out.print(c);
        }
        
        System.out.println("\nFin del programa");
        entrada.close();
        
    }
    //Método que permite introducir una frase por teclado
    private static String pedirFrase() {
        String frase = "";
        
        do{
            
            System.out.print("\nFrase: ");
            frase = entrada.nextLine();
            if (!frase.matches("[\\D]+")){
                System.out.println("Frase incorrecta. No puede estar vacía y no se permiten números");
                frase = "";
            }
            
        }while(frase.isEmpty());
        
        return frase;
    }
    //Método que cambia los caracteres 
    private static char[] cambiar(char[] charFrase) {
        char cambio[] = new char[charFrase.length];
        
        for (int i=0;i<charFrase.length;i++){
            if (Character.isUpperCase(charFrase[i])){
                cambio[i] = Character.toLowerCase(charFrase[i]);
            }else{
                cambio[i] = Character.toUpperCase(charFrase[i]);
            }    
        }
        
        return cambio;
    }
    
}
