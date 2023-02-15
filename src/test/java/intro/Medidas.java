// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        System.out.println("Cálculo de Areas");

        calcularAreaModoExtenso();
        calcularAreaModoCompacto();

    }

    public static void calcularAreaModoExtenso(){
        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso / Modo Extenso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4 unidades
        comprimento = 6; // comprimento recebe 3 unidades

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área total é de "
                + resultado + " m²");

    }
    public static void calcularAreaModoCompacto(){
        // Cálculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área total é de "
                + largura * comprimento + " m²");

    }

}
