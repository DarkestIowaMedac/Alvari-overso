import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Alvariño Alvariños[] = new Alvariño [9];
        Alvariños [0] = new Alvariño(12, 0, 180, 14, 14, 0, 12, 3, 5, 
        3, 0, 1, 2, 3, 4, 5);
        Alvariños [1] = new Alvariño(20, 0, 60, 12, 6, 0, 20, 1, 3, 
        8, 6, 7, 8, 9, 10, 11);
        Alvariños [2] = new Alvariño(1, 0, 105, 8, 1, 0, 16, 0, 5, 
        7, 12, 13, 14, 15, 16, 17);
        Alvariños [3] = new Alvariño(10, 10, 225, 10, 10, 0, 10, 0, 0, 
        10, 0, 18, 19, 20, 21, 22);
        Alvariños [4] = new Alvariño(5, 5, 225, 5, 12, 0, 14, 2, 6, 
        5, 23, 24, 25, 26, 27, 28);
        Alvariños [5] = new Alvariño(12, 18, 90, 9, 4, 0, 4, 999, 999, 
        999, 30, 31, 32, 33, 34, 35);
        Alvariños [6] = new Alvariño(2, 16, 150, 3, 12, 0, 1, 2, 10, 
        8, 36, 37, 38, 39, 40, 41);
        Alvariños [7] = new Alvariño(17, 11, 60, 15, 18, 0, 19, 2, 10, 
        999, 42, 43, 44, 45, 46, 47);
        Alvariños [8] = new Alvariño(1, 19, 300, 18, 11, 0, 4, 5, 8, 
        999, 0, 1, 2, 3, 4, 5);
        Scanner lectura = new Scanner (System.in);
        int eligeatualvariño;
        int eligej1oj2 = 1;
        do{
        do{ 
            System.out.println("Jugador "+ eligej1oj2+" elige tu Alvariño: ");
            System.out.println("0. Alvariño Base");
            System.out.println("1. Alvariño Gallego");
            System.out.println("2. Alvariño Gato");
            System.out.println("3. Alvariño Artístico");
            System.out.println("4. Alvariño Kawai");
            System.out.println("5. Alvariño Yihadista");
            System.out.println("6. Alvariño Programador");
            System.out.println("7. Alvariño Código");
            System.out.println("8. Alvariño Deidad");
            eligeatualvariño = lectura.nextInt();
            if ((eligeatualvariño >= 0 || eligeatualvariño <= 8) && eligej1oj2 == 1){
                Jugador j1 = new Jugador(Alvariños[eligeatualvariño], false, false, 0, 
                0, false);
                eligej1oj2++;
            }
            else if(eligeatualvariño >= 0 || eligeatualvariño <= 8){
                Jugador j2 = new Jugador(Alvariños[eligeatualvariño], false, false, 0, 
                0, false); 
                eligej1oj2++;
            }
        }while(eligeatualvariño < 0 || eligeatualvariño > 8);
        }while(eligej1oj2 < 3);
        
    }
}
