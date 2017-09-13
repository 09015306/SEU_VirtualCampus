package seu.vCampus.bz;

import java.util.Date;
import java.util.Vector;
import seu.vCampus.common.Order;

public interface IShopAdmin {
	public abstract boolean addProductAdmin(String id,String name,double price,int remainNum,String supplier,String tab);//��ӿ����Ʒ
	public abstract boolean deleteProductAdmin(String id);//ɾ�������Ʒ
	public abstract boolean changeProductPrice(String id,double price);//�޸���Ʒ����
	public abstract boolean changeProductRemainNum(String id,int num);//�޸���Ʒ�����
	public abstract boolean changeProductTab(String id,String tab);//�޸���Ʒ��ǩ
	public abstract Vector<Order> inquireOrder(Date t);//�������ڲ�ѯ����
}