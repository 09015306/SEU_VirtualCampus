package seu.vCampus.bz;

import java.util.Date;
import java.util.Vector;
import seu.vCampus.common.Product;
import seu.vCampus.common.Order;

public interface IShop {
//	public abstract void addProduct(String id);//��ӹ�����Ʒ
//	public abstract void deleteProduct(String id);//ɾ��������Ʒ
//	public abstract void changeBuyNum(int n);//�޸ĵ�Ʒ��������
	public abstract Vector<Product> inquireProduct(String name,String tab);//������Ʒ���ƺͱ�ǩ��ѯ��Ʒ
	public abstract Vector<Order> inquireOrder(String id,Date t);//�����µ����ڲ�ѯ����
//	public abstract double cost(double p,int n);//���㶩���ܽ��
	public abstract boolean buyOK(Vector<String>id,Vector<Integer>num,double cost);//ȷ�Ϲ���
}