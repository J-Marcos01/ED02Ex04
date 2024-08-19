package controller;
/*. Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo 
desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o 
produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial 
duplo de 5 é*/
import java.util.Scanner;
public class Recursiva04 
{
	public Recursiva04() 
	{
		super();
	
	}
	public int validaImpar(int n)
	{
		Scanner sc =new Scanner(System.in);
		do 
		{
			n=sc.nextInt();
		}
		while(n%2==0);
		return n;
	}
	
	
	public int fatorial(int x)
	{
		if(x==1)
		{
			return 1;
		}
		else
		{
			return x*fatorial(x-2);
		}
		
	}
	
}
