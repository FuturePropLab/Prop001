package Model;

public class Seller {
	private String name="";
	private String id="";
	private String password="";
	
	public void setName(String s){
		this.name=s;
	}
	public String getName(){
		return name;
	}
	
	public void setId(String s){
		this.id=s;
	}
	public String getId(){
		return this.id;
	}
	
	public void setPassword(String s){
		this.password=s;
	}
	public String getPassword(){
		return this.password;
	}
	
}
