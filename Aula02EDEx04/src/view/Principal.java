package view;
import controller.Recursiva04;
public class Principal
{

	public static void main(String[] args) 
	{
		Recursiva04 funcao = new Recursiva04();
		
		int n=1;
			n=funcao.validaImpar(n);
		int res=funcao.fatorial(n);
		System.out.println(res);
	}

}
