package _04_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	Cup cup = new Cup();
	Kettle kettle = new Kettle();
	TeaBag teabag = new TeaBag("Chamomile");
	cup.makeTea(teabag, kettle.getWater());
}
}
