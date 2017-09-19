package common;

import java.io.Serializable;

public class AppointInfo implements Serializable{

	private static final long serialVersionUID = 6;
	private String item;//��Ŀ����
	private String itemRemain[][];//�ö�ά���鱣�����ʱ���ʣ�ೡ��
	
	public AppointInfo(String item, String itemRemain) {
		this.item = item;
		setItemRemain(itemRemain);
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	//���ض�ά������ʽ��ʣ�ೡ�Σ����ͻ��ˣ�
	public String[][] getItemRemain(){
		return itemRemain;
	}
	//�����ַ�����ʽ��ʣ�ೡ�Σ������ݿ⣩
	public String getItemRemainStr() {
		//�ַ�����ʽ����ͬ����֮����";"�ָ���һ�첻ͬʱ��֮����"&"�ָ�
		String temp = "";
		
		for (int i = 0; i < itemRemain.length; i++) {  
            for (int j = 0; j < itemRemain[i].length; j++) {                
                temp += itemRemain[i][j] + "&";  
            }  
           	
            temp += ";";
        } 
		
		return temp;
	}
	//���ַ�����ʽ���ö�ά������ʽ
	public void setItemRemain(String itemRemain) {
		String temp[] = itemRemain.split(";");
		String res[][] = new String [temp.length][];
		
		for (int i = 0; i < temp.length; i++) {
			res[i] = temp[i].split("&");
		}

		this.itemRemain = res;
	}
}
