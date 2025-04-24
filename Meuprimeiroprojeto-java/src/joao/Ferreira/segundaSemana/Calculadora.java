/**
 * <h1>Calculadora</h1>
 * Acalculadora realiza operações matemáticas entre numeros inteiros
 * <p>
 * <b>Note:</> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 * @author Gleyson Sampaio
 * @version 1.0
 * @since 01/01/2022 
*/
package joao.Ferreira.segundaSemana;

public class Calculadora {
    /**
     * este método é utilizado para somar dois numeros inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois nḿeiros.
     */

    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }

    public int subtrair(int numeroUm, int numeroDois) { // Método para subtrair dois números
        return numeroUm - numeroDois;
    }

    public int multiplicar(int numeroUm, int numeroDois) { // Método para multiplicar dois números
        return numeroUm * numeroDois;
    }

    public double dividir(int numeroUm, int numeroDois) { // Método para dividir dois números inteiros, retornando um double
        if (numeroDois == 0) { // Verifica se o divisor é zero
            System.out.println("Não é possível dividir por zero."); // Mensagem de erro
            return 0; // Retorna 0 para evitar erro de divisão por zero
        }
        return (double) numeroUm / numeroDois; // Converte o numerador para double e realiza a divisão
    }

    public static void main(String[] args) { // Método principal que executa o programa
        Calculadora calc = new Calculadora(); // Cria um objeto da classe Calculadora

        int resultadoSoma = calc.somar(10, 5); // Chama o método somar passando 10 e 5
        int resultadoSubtracao = calc.subtrair(10, 5); // Chama o método subtrair passando 10 e 5
        int resultadoMultiplicacao = calc.multiplicar(10, 5); // Chama o método multiplicar passando 10 e 5
        double resultadoDivisao = calc.dividir(10, 2); // Chama o método dividir passando 10 e 2

        System.out.println("Soma: " + resultadoSoma); 
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao); 
    }
}