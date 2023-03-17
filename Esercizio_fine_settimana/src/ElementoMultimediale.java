
public abstract class ElementoMultimediale {

	String titolo;
	
	public ElementoMultimediale() {
	this.setTitolo();
	}
	
	public void setTitolo() {
		System.out.println("Inserisci il titolo dell'audio");
		this.titolo = Lettore_Multimediale.scanner.nextLine();	
		}
	
}
