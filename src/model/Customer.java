package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


public class Customer {
/*	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
*/
	private String id;
	private String name;
	private String email;
	
	//�����ڵ� �ڵ����� ��������±��� ���� 
	public Customer(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

}

//�̷��� �ϳ��� Bean�� �Ǵ°�����