package Exerc�cio;
import java.util.Scanner; 

public class Exerc�cio3 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

    int idade;

   System.out.println("Digite sua idade: ");
   idade= ler.nextInt();

    if((idade >= 10) && (idade <= 14)){
        System.out.println("Voc� est� na faixa Infantil!");
    }
    else if((idade >= 15) && (idade <= 17)){
        System.out.println("Voc� est� na faixa Juvenil!");
    }
    else if((idade >= 18) && (idade <= 25)){
        System.out.println("Voc� est� na faixa Adulto!");
    }
    else {
        System.out.println("Voc� n�o se encaixa em nenhuma faixa!");
    }

}

}

