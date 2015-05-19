package bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import java.util.List;

import model.*;

@Stateless
@LocalBean
public class ContractBean extends BeanBase{

	public Contract find(int contractNo){
		return em.find(Contract.class, contractNo);
	}
	
	public List<Contract> findAll(){
		Query q = em.createNamedQuery("Contract.findAll");
		return (List<Contract>)q.getResultList();
	}
}