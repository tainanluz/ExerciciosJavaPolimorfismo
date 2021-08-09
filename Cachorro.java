package PackagePolimorfismo;

public class Cachorro extends Animal 
{
	private boolean correr;
    private String raca;
    
     public Cachorro(String nome, int idade, boolean som, boolean correr, String raca) 
     {
		super(nome, idade, som);
		this.correr = correr;
		this.raca = raca;
     }
     public void imprimirInfo()
     {
    	 System.out.println("\n***Dados Cachorro***"+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+isSom()+
    			 "\nCorre: "+correr+"\nRaça: "+raca);    	 
     }
}
