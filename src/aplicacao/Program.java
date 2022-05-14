package aplicacao;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pedido pedido = new Pedido(001,new Date(), OrderStatus.PENDENTE);
		
		sc.close();

	}

}
