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
public class Main implements Serializable {

	@Inject
	private ProgramBean programBean;
	
	@Inject
	private ContractBean contractBean;

	@Inject
	private Contract contract;

	private List<Program> programList;
	

	public ProgramBean getProgramBean() {
		return programBean;
	}

	public void setProgramBean(ProgramBean programBean) {
		this.programBean = programBean;
	}

	public ContractBean getContractBean() {
		return contractBean;
	}

	public void setProgramList(List<Program> programList) {
		this.programList = programList;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContractBean(ContractBean contractBean) {
		this.contractBean = contractBean;
	}

	public List<Program> getProgramList() {
		return programList;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public String toMain(Contract c){
		contract = c;
		programList = programBean.findAll();
		return "Main";
	}
}
