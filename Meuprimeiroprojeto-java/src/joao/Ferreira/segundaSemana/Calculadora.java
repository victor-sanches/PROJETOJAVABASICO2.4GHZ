/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros.
 * <p>
 * <b>Nota:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 * </p>
 * 
 * <p>Métodos disponíveis:</p>
 * <ul>
 *   <li>Soma de dois números inteiros</li>
 *   <li>Subtração de dois números inteiros</li>
 *   <li>Multiplicação de dois números inteiros</li>
 *   <li>Divisão de dois números inteiros (com retorno decimal)</li>
 * </ul>
 * 
 * @author Victor Sanches
 * @version 2.0
 * @since 23/04/2025
 */
package joao.Ferreira.segundaSemana;

public class Calculadora {
    /**
     * este método é utilizado para somar dois numeros inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois nḿeiros.
     * 
     */

    public int somar(int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }
    /**
     * Realiza a subtração entre dois números inteiros.
     * @param numeroUm     o número que será subtraído 
     * @param numeroDois   o número que será subtraído do primeiro
     * @return int         o resultado da subtração
     */
    public int subtrair(int numeroUm, int numeroDois) { // Método para subtrair dois números
        return numeroUm - numeroDois;
    }
     /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param numeroUm     o primeiro fator da multiplicação
     * @param numeroDois   o segundo fator da multiplicação
     * @return int         o resultado da multiplicação
     */
    public int multiplicar(int numeroUm, int numeroDois) { // Método para multiplicar dois números
        return numeroUm * numeroDois;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * @param numeroUm     o dividendo da operação
     * @param numeroDois   o divisor da operação (não pode ser zero)
     * @return double      o resultado da divisão, incluindo casas decimais
     */
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
        int resultadoSubtracao = calc.subtrair(5, 20); // Chama o método subtrair passando 10 e 5
        int resultadoMultiplicacao = calc.multiplicar(10, 5); // Chama o método multiplicar passando 10 e 5
        double resultadoDivisao = calc.dividir(10, 2); // Chama o método dividir passando 10 e 2

        System.out.println("Soma: " + resultadoSoma); 
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao); 
    }
}