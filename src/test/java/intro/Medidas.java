// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import javax.print.DocFlavor;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Cálculo de Areas");
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);


        System.out.println("M E N U - D E - O P Ç Õ E S");
        System.out.println("c - CALCULAR MODO COMPACTO");
        System.out.println("e - CALCULAR MODO EXTENSO");
        System.out.println("i - IF SIMPLES");
        System.out.println("DIGITE A OPÇÃO DESEJADA");
        String opcao = scanner.next();


        // Switch = Selecionar o comportamento do programa conforma a escolha da pessoa ou software

       // String opcao = "ifSimples";

        switch (opcao){
            case "i":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "c":
                System.out.println("Você escolheu executar o método calcularAreaModoCompacto");
                calcularAreaModoCompacto();
                break;
            case "e":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você não escolheu nenhum dos metodos");
                break;
        }


    }

    public static void ifSimples(){
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = senão

        String modo = "melancia";

        if (modo == "curto"){
            calcularAreaModoCompacto();
        }
        else{
            calcularAreaModoExtenso();
        }


    }

    public static void calcularAreaModoExtenso(){
        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso / Modo Extenso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4 unidades
        comprimento = 6; // comprimento recebe 3 unidades

        resultado = largura * comprimento;
        System.out.println("[MODO EXTENSO] Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área total é de "
                + resultado + " m²");

    }
    public static void calcularAreaModoCompacto(){
        // Cálculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("[MODO COMPACTO] Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área total é de "
                + largura * comprimento + " m²");

    }

}
