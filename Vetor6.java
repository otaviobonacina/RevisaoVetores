import java.util.Scanner;
public class Vetor6 {
    public static void main(String[] args) {
 
        int sala1[][]=new int[2][6];
        Scanner sc=new Scanner(System.in);        
        System.out.println(sala1.length);
        int somaSala1=0;
        int somaSala2=0;
        
        for (int i = 0; i < sala1.length; i++) {
            for (int j = 0; j <6; j++) {
                System.out.println("Digite uma idade da sala: "+(i+1));
                sala1[i][j]=sc.nextInt();
                if(i==0){
                    somaSala1+=sala1[i][j];}
                else{
                    somaSala2+=sala1[i][j];}
                }
            }
            sc.close();
        
        System.out.println("A soma das idades da sala 1: "+somaSala1);
        
        System.out.println("A soma das idades da sala 2: "+somaSala2);
        }
 
    
    
}