package PackagePolimorfismo;

public class Pregui�a extends Animal
{
	private boolean sobeArvore;
	private String habitat;

	public Pregui�a(String nome, int idade, boolean som, boolean sobeArvore, String habitat) 
	{
		super(nome, idade, som);
		this.sobeArvore = sobeArvore;
		this.habitat = habitat;		
	}
	public void imprimirInfo()
	{
		System.out.println("\n***Dados pregui�a***"+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+isSom()+
				"\nSobe �rvore: "+sobeArvore+"\nHabitat: "+habitat);		
	}
	

}
