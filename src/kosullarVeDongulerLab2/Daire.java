package kosullarVeDongulerLab2;

import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {

	     Scanner scanner = new Scanner(System.in);

	     System.out.println("Lutfen Yaricapi Giriniz");
	     
	     int yaricap= scanner.nextInt();
	     
	     float alan = (float) (Math.PI * Math.pow(yaricap, 2));
	     float cevre = (float) (2*Math.PI*yaricap);
	     
	     System.out.println(alan);
	     System.out.println(cevre);
	}

}
