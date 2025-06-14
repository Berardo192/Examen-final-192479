public class Temperatura {

    public static int contarDiasCalurosos(int[][] matriz){
        int contador1 = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if (matriz.length > 30) {
                    contador1 += 1;
                }
            }
        }
         System.out.println("los dias mas caluroso fueron: " + contador1);
    }
    public static double promedioDiasFresco(int[][] matriz){
        int contador2 = 0;
        int suma = 0;
        float promedio = 0;
        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz.length; j++){
                if (matriz.length < 20) {
                    contador2 += 1;
                    suma += matriz.length;
                }
            }
        } promedio = (float) suma / contador2;
         System.out.println("los dias mas fresco fueron: " + contador2 + " el promedio es: " + promedio);

    }
    public static void imprimirTemperaturasExtremas(int[][] matriz){
        for (int i = 0 ; i < matriz.length; i++){
            for (int j = 0; < matriz.length; j++){
                if (matriz.length < 10 || matriz.length > 35 ) {
                    System.out.println("la fila es [" + matriz.length[i] + "] columna [" + matriz.length[j] + " posicion de temperaturas extremas");
                }
            }
        }

    }
    public static int[] posicionTemperaturaMasAlta(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){

            }
        }
    }
    public static void main(String[] args) {
        int [][] Temperatura = {{
            20, 30, 40, 0, 33, 21, 20,
            40, 0, 20, 0, 10, 19, 1,
            30, 10, 20, 0, 10, 30, 15,
        }
        };

        System.out.println(contarDiasCalurosos(Temperatura));
        System.out.println(promedioDiasFrescos(Temperatura));
        System.out.println(imprimirTemperaturasExtremas(Temperatura));
        System.out.println(posicionTemperaturaMasAlta(Temperatura));
    }
}
