import java.util.Scanner;

public class Immagine extends ElementoMultimediale implements Luminosità {

	private String luminosità = "Non impostata";
	private String titolo;
	
	
	public Immagine() {
		super();
		this.setLuminosità();
	}
	
	
	//GET
	
	public String getTitolo() {
		return titolo;
	}
	
	public String getLuminosità() {
		return luminosità;
	}
	
	//SET
	
	/*
	 * public void setTitolo() {
	 * System.out.println("Inserisci il titolo dell'immagine"); this.titolo =
	 * Lettore_Multimediale.scanner.nextLine() ; }
	 */
	
	public void setLuminosità() {
		System.out.println("Imposta la luminosità con un valore da 1 a 5");
		int l = Lettore_Multimediale.scanner.nextInt();
		switch(l) {
		case 0 :
			this.luminosità = "0";
			break;
		case 1 : 
			this.luminosità = "*";
			break;
		case 2 : 
			this.luminosità = "**";
			break;
		case 3 : 
			this.luminosità = "***";
			break;
		case 4 : 
			this.luminosità = "****";
			break;
		case 5 : 
			this.luminosità = "*****";
			break;
			default : System.out.println("Valore non presente");
		}
	}
	
	private void setLuminosità(int l) {
		switch(l) {
		case 0 :
			this.luminosità = "0";
			break;
		case 1 : 
			this.luminosità = "*";
			break;
		case 2 : 
			this.luminosità = "**";
			break;
		case 3 : 
			this.luminosità = "***";
			break;
		case 4 : 
			this.luminosità = "****";
			break;
		case 5 : 
			this.luminosità = "*****";
			break;
			default : System.out.println("Valore non presente");
		}
	}
	
	//LUMINOSIA
	
	@Override
	public void aumentaLuminosità() {
		if(this.luminosità == "0") {
			this.setLuminosità(1);
		} else if (this.luminosità == "Non impostata") {
			this.setLuminosità(1);
		} else if (this.luminosità == "*") {
			this.setLuminosità(2);
		} else if (this.luminosità == "**") {
			this.setLuminosità(3);
		} else if(this.luminosità == "***") {
			this.setLuminosità(4);
		}else if (this.luminosità == "****") {
			this.setLuminosità(5);
		}else 
			System.out.println("Max 5");
		System.out.println("Luminosità aumentata di 1");
	}

	@Override
	public void diminuisciLuminosità() {
		if(this.luminosità == "*****") {
			this.setLuminosità(4);
		} else if (this.luminosità == "****") {
			this.setLuminosità(3);
		} else if (this.luminosità == "***") {
			this.setLuminosità(2);
		} else if(this.luminosità == "**") {
			this.setLuminosità(1);
		}else if (this.luminosità == "*") {
			this.setLuminosità(0);
		}else 
			System.out.println("Min 0");
		System.out.println("Luminosità diminuita di 1");
	//SHOW
				
	}

	public static void show(Immagine img) {
		System.out.println(img.toString());
	}
	
	//TO STRING
	
	public String toString() {
		return " Titolo immagine: " + this.titolo + " \n" + " Luminosità: " + this.luminosità;  
	}
	
}
