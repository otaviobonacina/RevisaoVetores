public class Vetor3 {

    public static void main(String[]args){
    String meses[]={"janeiro","fevereiro","março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    
    System.out.println("inicio do 1º Semestre");
    for(int i=0; i<(meses.length)/2; i++){
        System.out.println(meses[i]);
    } System.out.println("Fim do 1º semestre");
    System.out.println("inicio do 2º Semestre");
    for(int i=6 ;i<meses.length; i++){
        System.out.println(meses[i]);
    } System.out.println("Fim do 2º Semestre");
    }
}
