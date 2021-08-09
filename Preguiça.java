package PackagePolimorfismo;

public class Preguiça extends Animal
{
	private boolean sobeArvore;
	private String habitat;

	public Preguiça(String nome, int idade, boolean som, boolean sobeArvore, String habitat) 
	{
		super(nome, idade, som);
		this.sobeArvore = sobeArvore;
		this.habitat = habitat;		
	}
	public void imprimirInfo()
	{
		System.out.println("\n***Dados preguiça***"+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+isSom()+
				"\nSobe árvore: "+sobeArvore+"\nHabitat: "+habitat);		
	}
	

}
