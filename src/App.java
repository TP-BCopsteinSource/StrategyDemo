
public class App {
	public static void main(String args[]) {
	    ClienteCiaAerea c = new ClienteCiaAerea(1010,"Zezinho");
	    System.out.println(c.milhasAcumuladas(5000));

	    c.setCalculoMilhas(new ClienteFrequente());
	    System.out.println(c.milhasAcumuladas(5000));

	    c.setCalculoMilhas(new PromocaoVerao());
	    System.out.println(c.milhasAcumuladas(5000));

	    c.setCalculoMilhas(new PromocaoDaSorte());
	    System.out.println(c.milhasAcumuladas(5000));

	}    
}
