package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

		private Map<String, Customer> customers; //맵은 키,벨류

		public CustomerService() {
			customers = new HashMap<String, Customer>();
			
			addCustomer(new Customer("id001","Alice","alice.hansung.ac.kr")); //맵에 집어넣기위한 함수
			addCustomer(new Customer("id002","Bob","bob.hansung.ac.kr"));
			addCustomer(new Customer("id003","Charlie","charlie.hansung.ac.kr"));
			addCustomer(new Customer("id004","David","david.hansung.ac.kr"));
			addCustomer(new Customer("id005","Trudy","trudy.hansung.ac.kr"));
			
		}
		
		public void addCustomer(Customer customer){
			customers.put(customer.getId(),customer); //key, value 
		} 
		
		public Customer findCustomer(String id){ //id를 받아서 정보찾아서 Customer bean을 넘겨주는것
			if(id != null)
				return (customers.get(id.toLowerCase())); //소문자로 다바꿩
			else
				return null;
		}
}
