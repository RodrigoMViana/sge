import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
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


        boolean senhaPadrao = false;

        String senha = null;

        while(senhaPadrao == false) {

            System.out.printf("\n");
            System.out.printf("            Digite uma senha: ");
            senha = scanner.nextLine();
            System.out.printf("\n");



            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {
                System.out.printf("                    Login criado com sucesso");
                senhaPadrao = true;
            }

            else {

                System.out.printf("Digite uma senha de no mínimo 8 caracteres, pelo menos um numero, uma letra minúscula, uma letra maiuscula e um caractere especial:");
                System.out.printf("\n");
                    }
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


                    boolean login1 = false;
                    while (login1==false)  {
                    System.out.printf("            Digite seu Login: ");
                    String log1 = scanner.nextLine();
                    if (log.equals(log1)) {
                        login1 = true;

                        System.out.printf("\n");

                        boolean senhaCerta = false;
                        while (senhaCerta==false) {

                        int cont = 0;
                        while (cont<=2) {
                        System.out.printf("            Digite sua senha: ");
                        String senha1 = scanner.nextLine();
                        System.out.printf("\n");
                        if (senha.equals(senha1)) {

                            System.out.printf("                 Login realizado com sucesso");

                        } else {
                            System.out.printf("                senha inválida");
                            System.out.printf("\n");
                            System.out.printf("\n");
                        }
                        }
                        }
                    }
                    else {
                        System.out.printf("\n");
                        System.out.printf("Login inválido - Seu Login é a primeira letra do seu nome mais _ mais seu ultimo sobrenome");
                        System.out.printf("\n");
                        System.out.printf("\n");
                        System.out.println("             Exemplo: teobaldo souza");
                        System.out.println("             login:   t_souza");
                        System.out.printf("\n");
                        System.out.printf("\n");
                    }

                    }


            }
        }