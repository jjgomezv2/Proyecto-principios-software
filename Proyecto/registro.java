import java.util.Scanner;
public class Registro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido a SwiFit");
        System.out.println("Registro");
        System.out.println("Por favor ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Por favor ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Por favor ingrese su correo electrónico");
        String correo = entrada.nextLine();
        System.out.println("Por favor ingrese su celular que será su username");
        String celular = entrada.nextLine();
        System.out.println("Por favor ingrese su contraseña");
        String password = entrada.nextLine();
        System.out.println("Por favor ingrese su contraseña de nuevo");
        String password_conf = entrada.nextLine();
    }
    
}
