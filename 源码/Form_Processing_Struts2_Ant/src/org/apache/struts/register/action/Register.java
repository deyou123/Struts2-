package org.apache.struts.register.action;

import org.apache.struts.register.model.Person;

import com.opensymphony.xwork2.ActionSupport;


public class Register extends ActionSupport {
    /**
     * 
     */
    private static final long serialVersionUID = 430257424163073410L;
    
    private Person personBean;
    

    public Person getPersonBean() {
        return personBean;
    }


    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    
    public String execute() throws Exception {
	
	return SUCCESS;
    }
    
    
}
