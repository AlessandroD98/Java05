
public class Audio extends ElementoMultimediale implements VideoAndRec {

	private String titolo;
	private int volume = 0;
	private int durata;
	
	//COSTRUTTORE
	
	public Audio() {
		super();
		this.setDurata();
		this.setVolume();
	}
	
	//SET

	public void setTitolo() {
		System.out.println("Inserisci il titolo dell'audio");
		this.titolo = Lettore_Multimediale.scanner.nextLine();	
	}
	
	public void setDurata() {
		System.out.println("Inserisci la durata dell'audio");
		this.durata = Lettore_Multimediale.scanner.nextInt();
		Lettore_Multimediale.scanner.nextLine();
	}
	
	public void setVolume() {
		System.out.println("Inserisci il volume dell'audio min: 1 max: 5 ");
		int v = Lettore_Multimediale.scanner.nextInt();
		Lettore_Multimediale.scanner.nextLine();
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
	
	//GEt
	
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public int getDurata() {
		return this.durata;
	}
	
	//PLAY
	
	@Override
	public  void play() {
		if(this.durata > 0) {
			int j = 0;
			while(j < this.durata) {
				
				String puntiEsclamativi = "";
				for(int i=0; i < this.volume; i++) {
					puntiEsclamativi += "!";
				}
				System.out.println("Titolo: " + this.titolo + "Volume: " + puntiEsclamativi);
				j++;
			}
			
		} else System.out.print("Breve ma intenso");
	
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

}
