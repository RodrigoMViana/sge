import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("---------------------------------------------------------------------");
        System.out.printf("\n");
        System.out.printf("                             Cadastro");
        System.out.printf("\n");
        System.out.printf("---------------------------------------------------------------------");
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("            Digite seu e-mail: ");
        String email = scanner.nextLine();
        System.out.printf("\n");
        System.out.printf("            Digite uma senha: ");
        String senha = scanner.nextLine();
        System.out.printf("\n");
        if (senha.length() >= 8) {
            System.out.printf("            Login criado com sucesso");
        }
        else {
            System.out.printf("         Digite uma senha de no mínimo 8 caracteres: ");
            String senha1 = scanner.nextLine();
            System.out.printf("Senha criada com sucesso ");

        }
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("---------------------------------------------------------------------");
        System.out.printf("\n");
        System.out.printf("                             Login");
        System.out.printf("\n");
        System.out.printf("---------------------------------------------------------------------");
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("            Digite seu e-mail: ");
        String email1 = scanner.nextLine();
        if (email.equals(email1)) {
            System.out.printf("\n");
            System.out.printf("            Digite sua senha: ");
            String senha1 = scanner.nextLine();
            System.out.printf("\n");
            if ( senha.equals(senha1)) {
                System.out.printf("            Login realizado com sucesso");
            }
                else {
                    System.out.printf("            senha inválida");
                }
            }
        else {
            System.out.printf("            Email inválido");
        }

    }
}