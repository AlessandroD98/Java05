
public class Video extends ElementoMultimediale implements VideoAndRec, Luminosità {

	private int durata;
	private int volume;
	private String luminosità;
	private String titolo;
	
	public Video() {
		super();
		this.setDurata();
		this.setVolume();
		this.setLuminosità();
	}
	
	//SET
		
	public void setDurata() {
		System.out.println("Inserisci la durata dell'audio");
		this.durata = Lettore_Multimediale.scanner.nextInt();
	}
	
	public void setVolume() {
		System.out.println("Inserisci il volume dell'audio min: 1 max: 5 ");
		int v = Lettore_Multimediale.scanner.nextInt();
		switch(v) {
		case 0 : 
			this.volume = 0;
			break;
		case 1 : 
			this.volume = 1;
			break;
		case 2 : 
			this.volume = 2;
			break;
		case 3 : 
			this.volume = 3;
			break;
		case 4 : 
			this.volume = 4;
			break;
		case 5 : 
			this.volume = 5;
			break;
			default : System.out.println("Spiaze");
		}
		
	}
	
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
	
	//GET
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public int getDurata() {
		return this.durata;
	}
	
	public String getLuminosità() {
		return luminosità;
	}
	
	//PLAY
	
	@Override
	public void play() {
		
		
	}

	//REGOLA VOLUME
	
	@Override
public void abbassaVolume() {
		
		switch(this.volume) {
		case 0 :
			System.out.println("Non puoi abbassare più di così!");
			break;
		case 1 :
			this.volume = 0;
			break;
		case 2 :
			this.volume = 1;
			break;
		case 3 :
			this.volume = 2;
			break;
		case 4 :
			this.volume = 3;
			break;
		case 5 :
			this.volume = 4;
			break;
			default : System.out.println("Error");
		}
	}

	@Override
	public void alzaVolume() {
		
		switch(this.volume) {
		case 5 :
			System.out.println("Non puoi alzare più di così!");
			break;
		case 4 :
			this.volume = 5;
			break;
		case 3 :
			this.volume = 4;
			break;
		case 2 :
			this.volume = 3;
			break;
		case 1 :
			this.volume = 2;
			break;
		case 0 :
			this.volume = 1;
			break;
			default : System.out.println("Error");
		}
		
	}

	//REGOLA LUMINOSITA
	
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

}
}