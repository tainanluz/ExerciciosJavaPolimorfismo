package PackagePolimorfismo;

public class AnimalTeste 
{
    public static void main(String args[])
    {
    	Cachorro dog = new Cachorro ("Doguinho",3,true,true,"Golden");
    	Cavalo hor = new Cavalo ("Spirit",5,true,true,"A�o");
    	Pregui�a pre = new Pregui�a ("Suave",4,false,true,"Mata Atl�ntica");
    	
    	dog.imprimirInfo();
    	hor.imprimirInfo();
    	pre.imprimirInfo();
    }
}
