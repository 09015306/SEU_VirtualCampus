package seu.vCampus.common;

public class Product {
	String productID;//��Ʒ�ɣ�
	String productName;//��Ʒ����
	double price;//��Ʒ����
	int remainNum;//��Ʒ�����
	String supplier;//��������
	String tab;//��ǩ
	
	public void setProductID(String id){
		productID=id;
	}
	public String getProductID(){
		return productID;
	}
	public void setProductName(String name){
		productName=name;
	}
	public String getProductName(){
		return productName;
	}
	public void setPrice(double p){
		price=p;
	}
	public double getPrice(){
		return price;
	}
	public void setRemainNum(int r){
		remainNum=r;
	}
	public int getRemainNum(){
		return remainNum;
	}
	public void setSupplier(String s){
		supplier=s;
	}
	public String getSupplier(){
		return supplier;
	}
	public void setTab(String t){
		tab=t;
	}
	public String getTab(){
		return tab;
	}
}
