package PackagePolimorfismo;

public class Cavalo extends Animal
{
	private boolean correr;
	private String ferradura;

	public Cavalo(String nome, int idade, boolean som, boolean correr, String ferradura) 
	{
		super(nome, idade, som);
		this.correr = correr;
		this.ferradura = ferradura;
	}
	public void imprimirInfo()
	{
		System.out.println("\n***Dados Cavalo***"+"\nNome: "+getNome()+"\nIdade: "+getIdade()+
				"\nSom: "+isSom()+"\nCorre: "+correr+"\nFerradura: "+ferradura);
	}
     
}
