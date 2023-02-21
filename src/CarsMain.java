
public class CarsMain {
	public static void main(String[] args) {
		Cars car1=new Cars("Red", "Audi A6", 1.6, 4);
		Cars car2=new Cars();
		Cars car3=new Cars("Black", "Mercedes");
		car1.ShowInfos();	
		car2.ShowInfos();
		car3.ShowInfos();
	}

}
