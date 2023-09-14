
import java.util.Scanner;


public class Entrada {
    private static Scanner input = new Scanner(System.in);
    
    public static int readint(String mss) {
        System.out.println(mss);
        return input.nextInt();
    }
        public static String readText(String mss) {
        System.out.println(mss);
        return input.nextLine();
    }

    static String readTex(String nombre_estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
