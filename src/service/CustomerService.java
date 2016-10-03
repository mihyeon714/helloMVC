package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

		private Map<String, Customer> customers; //���� Ű,����

		public CustomerService() {
			customers = new HashMap<String, Customer>();
			
			addCustomer(new Customer("id001","Alice","alice.hansung.ac.kr")); //�ʿ� ����ֱ����� �Լ�
			addCustomer(new Customer("id002","Bob","bob.hansung.ac.kr"));
			addCustomer(new Customer("id003","Charlie","charlie.hansung.ac.kr"));
			addCustomer(new Customer("id004","David","david.hansung.ac.kr"));
			addCustomer(new Customer("id005","Trudy","trudy.hansung.ac.kr"));
			
		}
		
		public void addCustomer(Customer customer){
			customers.put(customer.getId(),customer); //key, value 
		} 
		
		public Customer findCustomer(String id){ //id�� �޾Ƽ� ����ã�Ƽ� Customer bean�� �Ѱ��ִ°�
			if(id != null)
				return (customers.get(id.toLowerCase())); //�ҹ��ڷ� �ٹٲ�
			else
				return null;
		}
}
