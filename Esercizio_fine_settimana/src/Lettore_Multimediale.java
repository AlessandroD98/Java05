import java.util.Scanner;

public class Lettore_Multimediale {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Audio a1 = new Audio();
		Immagine i1 = new Immagine();
		Video v1 = new Video();
		

		ElementoMultimediale[] arr = new ElementoMultimediale [3];
		
		arr[0] = a1;
		arr[1] = i1;
		arr[2] = v1;
		
		Select(arr);
	}

	public static void Select(ElementoMultimediale[] arr) {
		boolean exit = false;
		while(!exit) {
			System.out.println("Seleziona l'elemento dell'array da visualizzare da 1 a " + arr.length + " o digita exit per uscire:");
			String input = scanner.nextLine();
			if(input.equals("exit")) {
				exit = true;
			} else {
				int p = Integer.parseInt(input) - 1;
				if(p >= 0 && p < arr.length) {
					if(arr[p] instanceof Immagine) {
						Immagine i = (Immagine) arr[p];
						i.show(i);
					} else if (arr[p] instanceof Audio) {
						Audio a = (Audio) arr[p];
						a.play();
					} else if (arr[p] instanceof Video) {
						Video v = (Video) arr[p];
						v.play();
					}
				} else {
					System.out.println("Il valore inserito non è valido. Inserire un valore compreso tra 1 e " + arr.length);
				}
			}
		}
	}
}	


