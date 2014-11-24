package com.training.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User: assanai.manurat
 * Date: 4/24/2014
 * Time: 10:33 PM
 */
//@Component
public class ExampleComponent {


    @Value("${component.message}")
    private String message = "This is my example component bean";
    
    @Value("${address}")
    private String address;
    
    @Value("${company}")
    private String company;
    
    @Autowired
    private Hello hello;

    @Autowired
    private Humen humen;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}
	
	
	public Humen getHumen() {
		return humen;
	}

	public void setHumen(Humen humen) {
		this.humen = humen;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ExampleComponent{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
