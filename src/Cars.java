
public class Cars {
	
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public Cars(String color, String model, double engine, int doors) {
		this.color=color;
		this.model=model;
		this.engine=engine;
		this.doors=doors;
		
	}
	public Cars() {
		this.color="No info";
		this.model="No info";
		this.engine=0;
		this.doors=0;
		
		//it can be this way
			//this("No info", "No info", 0, 0);
		   
	}
	public Cars(String color, String model) {
		this(color, model, 0, 0);
		
	}
	public void ShowInfos() {
		System.out.println("Color: "+ this.color);
		System.out.println("Model: "+ this.model);
		System.out.println("Engine: "+ this.engine);
		System.out.println("Doors: "+ this.doors);
		
	}

}
