
package laboratorioarreglos.pkg67606;

public class Practica2 {
    
public static void main(String[] args){
 //PRIMERA PARTE : DECLARACION Y CONSTRUCCION DE ARREGLOS
 // OPERADORES DE INCREMENTO
  int [] arreglo;
  int tamañoArreglo = 5;
  arreglo = new int[tamañoArreglo];
  
    System.out.println("LOS " + arreglo.length + "ELEMENTOS DEL ARREGLOS");
    System.out.println("arreglo [0]");
    System.out.println("arreglo [1]");
    System.out.println("arreglo [2]");
    System.out.println("arreglo [3]");
    System.out.println("arreglo [4]");
    System.out.println("arreglo [5]" );
    //SEGUNDA PARTE INICIALIZACIONES AUTOMATICAS
    int[] calificaciones= {10,8,6,9,9,7};
    System.out.println("LOS" + calificaciones.length + 
            "ELEMENTOS DE CALIFICACIONES: ");
    System.out.println("ELEMENTO 1: " + calificaciones[0]);
    System.out.println("ELEMENTO 2: " + calificaciones[1]);
    System.out.println("ELEMENTO 3: " + calificaciones[2]);
    System.out.println("ELEMENTO 4: " + calificaciones[3]);
    System.out.println("ELEMENTO 5: " + calificaciones[4]);
    System.out.println("ELEMENTO 6: " + calificaciones[5]);
    //TERCERA PARTE: ARREGLO MULTIDIMENSIONALES
    int [][] matriz= new int[2][2];
    matriz [0][0] =11;
    matriz [0][1] =12;
    matriz [1][0] =21;
    matriz [1][1] =22;
    System.out.println("UNA MATRIZ DE 2 * 2:");
    System.out.println("[" + matriz [0][0] + " " + matriz [0][1]+"]");
    System.out.println("[" + matriz [1][0] + " " + matriz [1][1]+"]");
    
    int [][] noMatriz= {{1,2,3},{4,5},{6,7,8,9}};
    System.out.println("UNA NOMATRIZ INICIALIZADA AUTOMATICAMENTE:");
    System.out.println("[" + noMatriz[0][0]+" " + noMatriz[0][1]+ 
            " " + noMatriz[0][2]+ "]");
    System.out.println("[" + noMatriz[1][0]+" " + noMatriz[1][1]+"]");
    System.out.println("[" + noMatriz[2][0]+" " + noMatriz[2][1]+ 
            " " + noMatriz[2][2]+ " " + noMatriz[2][3]+ "]");
    
    
    
    
    
    
    
    }
    
}
