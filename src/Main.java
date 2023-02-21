
public class Main {
public static void main(String[] args) {
	Car car1=new Car();
	
	car1.setColor("Red");
	car1.setModel("Audi A6");
	car1.setEngine(1.6);
	car1.setDoors(4);
	
	System.out.println("Color: "+ car1.getColor());
	System.out.println("Model: "+ car1.getModel());
	System.out.println("Engine: "+ car1.getEngine());
	System.out.println("Doors: "+ car1.getDoors());
	car1.start();
	car1.stop();
	
	
	
}
}
