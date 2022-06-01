public class App {

    public static boolean repetido(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if(i != j && numeros[i] == numeros[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    

    public void interfaz(){
        System.out.println("ingrese la opcion qe desee: ");
        System.out.println("(1) para buscar los 3 datos mas relevantes ingresando numeros.");
        System.out.println("(2) para buscar los 5 datos mas relevantes ingresando palabras.");
        System.out.println("(3) para buscar los 5 datos mas relevantes ingresando oraciones.");
      }
}   

