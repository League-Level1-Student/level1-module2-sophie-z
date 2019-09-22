package _06_minion;

public class Minion {
private String name;
private int eyes;
private String color;
private String Master;

public Minion(String name, int eyes, String color, String master) {
	this.name = name;
	this.eyes = eyes;
	this.color= color;
	this.Master = master;
}
String getName() {
	return name;
}
void setName(String name) {
	this.name = name;
}
int getEyes() {
	return eyes;
}
void setEyeNumber(int eyes) {
	this.eyes = eyes;
}
String getColor() {
	return color;
}
void setColor(String color) {
	this.color = color;
}
String getMaster() {
	return Master;
}
void setMaster(String master) {
	this.Master = master;
}

}
