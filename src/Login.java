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
        System.out.printf("            Digite seu nome completo: ");
        String nome = scanner.nextLine();

        String[] array = nome.split(" ");
        String letra = String.valueOf(array[0].charAt(0));
        String sobrenome = array[array.length -1];
        String log = letra+"_"+sobrenome;

        System.out.printf("\n");
        System.out.printf("            Digite uma senha: ");
        String senha = scanner.nextLine();

        int cont = 0;
        boolean temCaracter = false;
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        while(cont < (senha.length()) ) {
            String caracter = String.valueOf(senha.charAt(cont));
            if (caracter.equals("@-!-#")) {
                temCaracter = caracter.equals("@-!-#");
                if (temCaracter == true) {
                    break;
                }
            }
            String letraMaiuscula = String.valueOf(senha.charAt(cont));
                if (letraMaiuscula.equals("A-Z")) {
                    temMaiuscula = letraMaiuscula.equals("A-Z");
                    if (temCaracter == true) {
                        break;
                    }
                }

            String letraMinuscula = String.valueOf(senha.charAt(cont));
                if (letraMinuscula.equals("a-z")) {
                    temMinuscula = letraMinuscula.equals("a-z");
                    if (temMinuscula == true) {
                        break;
                    }
                }
            String Numero = String.valueOf(senha.charAt(cont));
                if (Numero.equals("0-9")) {
                    temNumero = Numero.equals("0-9");
                    if (temNumero == true) {
                        break;
                    }
                }
                cont++;
            }

                    System.out.printf("\n");

                if(8 <= senha.length()) {
                    if ((temCaracter = true) && (temMaiuscula = true) && (temMinuscula = true) && (temNumero = true)) {
                        System.out.printf("                    Login criado com sucesso");
                    }
                    else{
                        System.out.printf("         Digite uma senha de no mínimo 8 caracteres, que tenha pelo menos um numero,uma letra minuscula, uma letra maiuscula e um caractere especial ");
                        String senha1 = scanner.nextLine();
                        System.out.printf("                    Login criado com sucesso");
                    }
                }
                else {
                    System.out.printf("         Digite uma senha de no mínimo 8 caracteres, que tenha pelo menos um numero,uma letra minuscula, uma letra maiuscula e um caractere especial ");
                    String senha1 = scanner.nextLine();
                    System.out.printf("                    Login criado com sucesso");
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
                    System.out.printf("            Digite seu Login: ");
                    String log1 = scanner.nextLine();
                    if (log.equals(log1)) {
                        System.out.printf("\n");
                        System.out.printf("            Digite sua senha: ");
                        String senha1 = scanner.nextLine();
                        System.out.printf("\n");
                        if (senha.equals(senha1)) {
                            System.out.printf("                 Login realizado com sucesso");
                        } else {
                            System.out.printf("            senha inválida");
                        }
                    } else {
                        System.out.printf("                 Login inválido");
                    }


            }
        }