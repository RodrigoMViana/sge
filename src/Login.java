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

        while(cont < (senha.length() ) ) {
            String caracter = String.valueOf(senha.charAt(cont));
            if (caracter.equals("@") || caracter.equals("!") || caracter.equals("#") ) {
                temCaracter = true;
                    break;
                }

            cont++;
        }
        while(cont < (senha.length()) ) {
            String letraMaiuscula = String.valueOf(senha.charAt(cont));
                if (letraMaiuscula.equals("A") || letraMaiuscula.equals("B") || letraMaiuscula.equals("C") || letraMaiuscula.equals("D")
                        || letraMaiuscula.equals("E") || letraMaiuscula.equals("F") || letraMaiuscula.equals("G") || letraMaiuscula.equals("H")
                        || letraMaiuscula.equals("I") || letraMaiuscula.equals("J") || letraMaiuscula.equals("K") || letraMaiuscula.equals("L")
                        || letraMaiuscula.equals("M") || letraMaiuscula.equals("N") || letraMaiuscula.equals("O") || letraMaiuscula.equals("P")
                        || letraMaiuscula.equals("Q") || letraMaiuscula.equals("R") || letraMaiuscula.equals("S") || letraMaiuscula.equals("T")
                        || letraMaiuscula.equals("U") || letraMaiuscula.equals("V") || letraMaiuscula.equals("W") || letraMaiuscula.equals("X")
                        || letraMaiuscula.equals("Y") || letraMaiuscula.equals("Z")) {
                    temMaiuscula = true;

                        break;
                    }

            cont++;
        }
        while(cont < (senha.length()) ) {
            String letraMinuscula = String.valueOf(senha.charAt(cont));
                if (letraMinuscula.equals("a") || letraMinuscula.equals("b") || letraMinuscula.equals("c") || letraMinuscula.equals("d")
                    || letraMinuscula.equals("e") || letraMinuscula.equals("f") || letraMinuscula.equals("g") || letraMinuscula.equals("h")
                    || letraMinuscula.equals("i") || letraMinuscula.equals("j") || letraMinuscula.equals("k") || letraMinuscula.equals("l")
                    || letraMinuscula.equals("m") || letraMinuscula.equals("n") || letraMinuscula.equals("o") || letraMinuscula.equals("p")
                    || letraMinuscula.equals("q") || letraMinuscula.equals("r") || letraMinuscula.equals("s") || letraMinuscula.equals("t")
                    || letraMinuscula.equals("u") || letraMinuscula.equals("v") || letraMinuscula.equals("w") || letraMinuscula.equals("x")
                    || letraMinuscula.equals("y") || letraMinuscula.equals("z")) {
                    temMinuscula = true;

                        break;
                    }

            cont++;
        }
        while(cont < (senha.length()) ) {
            String Numero = String.valueOf(senha.charAt(cont));
                if (Numero.equals("0") || Numero.equals("1") || Numero.equals("2") || Numero.equals("3") || Numero.equals("4")
                        || Numero.equals("5") || Numero.equals("6") || Numero.equals("7") || Numero.equals("8") || Numero.equals("9") ) {
                    temNumero = true;
                        break;
                    }

                cont++;
            }

                    System.out.printf("\n");

                if(senha.length() >=8 ) {
                    if ((temCaracter == true) && (temMaiuscula == true) && (temMinuscula == true) && (temNumero == true)) {
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