package controller;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.io.Serializable;
import java.util.List;

import bean.*;
import model.*;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class Index implements Serializable {

	@Inject
	private ContractBean contractBean;
	
	public ContractBean getContractBean() {
		return contractBean;
	}

	public void setContractBean(ContractBean contractBean) {
		this.contractBean = contractBean;
	}

	public Index() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Contract> getContractList(){
		return contractBean.findAll();
	}
}
