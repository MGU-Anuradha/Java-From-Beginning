class Father{
	protected TeaBuds land(Plant p, Fertilizer f, Workers w){
		System.out.println("Worker type\t= "+w.getWorker_Type());
		System.out.println("Fertilizer type\t= "+f.getFertilizer_name());
		System.out.println("Plant type\t= "+p.getPlantName());
		TeaBuds t = new TeaBuds();
		t.setProduct("Green Tea Buds");
		return t;
	}
}
class Son extends Father{
	protected Coconuts land (Plant p, Fertilizer f, Workers w){
		System.out.println("Worker type\t= "+w.getWorker_Type());
		System.out.println("Fertilizer type\t= "+f.getFertilizer_name());
		System.out.println("Plant type\t= "+p.getPlantName());
		Coconuts c = new Coconuts();
		c.setProduct("Husking coconuts");
		return c;
	}
	
}
//----------------------------------------------------
public class MainPro{
	public static void main(String[] args){
		Plant plant =new Plant();
		Fertilizer fertilizer = new Fertilizer();
		Workers worker = new Workers();
		
		//for father method
		//plant.setPlantName("Tea plants");
		//fertilizer.setFertilizer("Tea fertilizer");
		//worker.setWorker("Tea workers");
		
		//for son's method	
		plant.setPlantName("Coconut plants");
		fertilizer.setFertilizer("Coconut fertilizer");
		worker.setWorker("Coconut workers");
		
		Son son = new Son();

		//TeaBuds t1=son.land(plant,fertilizer,worker)
		Coconuts c1 = son.land(plant,fertilizer,worker);
		System.out.println("return product is "+c1.getProduct());
	}
}
//----------------------------------------------------
class Plant{
	private String plantName;
	public void setPlantName(String plantName){
		this.plantName=plantName;
	}
	public String getPlantName(){
		return plantName;
	}
}
class Fertilizer{
	private String fertilizer_name;
	public void setFertilizer(String fertilizer_name){
		this.fertilizer_name=fertilizer_name;
	}
	public String getFertilizer_name(){
		return fertilizer_name;
	}
}
class Workers{
	private String worker_type;
	public void setWorker(String worker_type){
		this.worker_type=worker_type;
	}
	public String getWorker_Type(){
		return worker_type;
	}
}
class AgriculturalProducts{
	private String product_name;
	public void setProduct(String product_name){
		this.product_name=product_name;
	}
	public String getProduct(){
		return product_name;
	}
}
class TeaBuds extends AgriculturalProducts{
	
}
class Coconuts extends TeaBuds{
	
}
