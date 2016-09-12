package Model;

import java.sql.Date;

public class Record {
	private Seller seller1=new Seller();
	private Goods g=new Goods();
	private Date sellTime;
	private int sellNum;//卖出件数
	private int serialNum;//货物编号
	
	public void setSeller(Seller s){
		seller1=s;
	}
	public Seller getSeller(){
		return seller1;
	}
	public void setGoods(Goods good){
		g=good;
	}
	public Goods getGoods(){
		return g;
	}
	public void setTime(Date d){
		sellTime=d;
	}
	public Date getTime(){
		return sellTime;
	}
	public void setSellnum(int i1){
		sellNum=i1;
	}
	public int getSellnum(){
		return sellNum;
	}
	public void setSerialnum(int i2){
		serialNum=i2;
	}
	public int getSerialnum(){
		return serialNum;
	}
	
}

	