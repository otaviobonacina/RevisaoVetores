// importa a classe "Scanner" para o nosso projeto, que está dentro do pacote java.util
import java.util.Scanner;
// cria uma classe publica chamada vetor2 e inicia o corpo da classe por meio do
 class Vetor2 {
        public static void main(String[]args){
// criar um objeto sc para receber dados dos usuarios via teclado
            Scanner sc=new Scanner(System.in);
            int n=5;
            String funcionario[]= new String[n];

// comente cada linha em detalhe, não pode faltar nada 
//---for---estrutura de repetição para o nome do funcionario para cada um dos valores
// o metodo --- .length --- retorna o tamano do total do vetor

                for(int index=0; index < funcionario.length; index ++){
                    System.out.println("Digite o nome do funcionario");
                    funcionario[index]=sc.next();
}               System.out.print("***********************");
                for(int index=0; index < funcionario.length; index ++){
                    System.out.println(funcionario[index]);
                }
}
}
