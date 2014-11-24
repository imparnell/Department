package com.training.spring.bean;

/**
 * Date: 10/31/2014
 * Time: 3:32 PM
 *
 * @author assanai.manurat
 */
public class Humen {

    private String firstName;

    private String lastName;
    private Hello hello;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Hello getHello() {
		return hello;
	}

	public void setHello(Hello hello) {
		this.hello = hello;
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Humen{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
