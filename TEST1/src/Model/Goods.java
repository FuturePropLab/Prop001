package Model;

public class Goods {
	private String name="";
	private int remainNum;
	private double price;
	
	public void setName(String s){
		name=s;
		
	}
	public String getName(){
		return name;
	}
	
	public void setRemain(int i){
		remainNum=i;
	}
	public int getRemian(){
		return remainNum;
	}
	
	public void setPrice(double d){
		price=d;
	}
	public double getPrice(){
		return price;
	}
}
