package seu.vCampus.common;

import java.util.Date;
import java.util.Vector;

public class Order {
	String userID;//�µ��˵ģɣ�
	String orderID;//�����ɣ�
	double cost;//�����ܽ��
	Date time;//�µ�ʱ��
	Vector<String>vectorID;//������������ƷID
	Vector<Integer>vectorBuyNum;//������ÿ����Ʒ�Ĺ������
	
	public void setUserID(String id) {
		userID=id;
	}
	public String getUserID() {
		return userID;
	}
	public void setCost(double c){
		cost=c;
	}
	public double getCost(){
		return cost;
	}
	public void setTime(Date t){
		time=t;
	}
	public Date getTime(){
		return time;
	}
	public void setOrderID(String o){
		orderID=o;
	}
	public String getOrderID(){
		return orderID;
	}
	public void setEveryProductID(Vector<String> id) {
		vectorID=id;
	}
	public Vector<String> getEveryProductID(){
		return vectorID;
	}
	public void setEveryProductBuyNum(Vector<Integer> num) {
		vectorBuyNum=num;
	}
	public Vector<Integer> getEveryProductBuyNum(){
		return vectorBuyNum;
	}
}
