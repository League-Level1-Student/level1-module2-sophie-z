package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy =  new Smurf("Handy");
	Handy.eat();
	Handy.getName();
	Smurf PapaSmurf =  new Smurf("PapaSmurf");
	Smurf Smurfette = new Smurf("Smurfette");
	PapaSmurf.getName();
	Smurfette.getName();
	PapaSmurf.getHatColor();
	Smurfette.getHatColor();
	PapaSmurf.isGirlOrBoy();
	Smurfette.isGirlOrBoy();
}
}
