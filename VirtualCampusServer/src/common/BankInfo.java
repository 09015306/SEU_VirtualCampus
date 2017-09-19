package common;

import java.io.Serializable;

public class BankInfo implements Serializable{

	private static final long serialVersionUID = 3;
	private String id;//�û�ID
	private double balance;//��ǰ���
	private String transferTo;//ת�˶���
	private double transferAmount;//ת������
	private long transferDate;//ת��ʱ�䣨ʱ�����
	
	public BankInfo(String id, double b, String to, double am, long dt) {
		this.setId(id);
		this.setBalance(b);
		this.setTransferTo(to);
		this.setTransferAmount(am);
		this.setTransferDate(dt);
	}
	
	public void setId(String param) {
		this.id = param;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setBalance(double param) {
		this.balance = param;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setTransferTo(String param) {
		this.transferTo = param;
	}
	
	public String getTransferTo() {
		return this.transferTo;
	}
	
	public void setTransferAmount(double param) {
		this.transferAmount = param;
	}
	
	public double getTransferAmount() {
		return this.transferAmount;
	}
	
	public void setTransferDate(long param) {
		this.transferDate = param;
	}
	
	public long getTransferDate() {
		return this.transferDate;
	}

}
