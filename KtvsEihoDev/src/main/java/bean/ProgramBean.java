package bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import java.util.List;

import model.*;

@Stateless
@LocalBean
public class ProgramBean extends BeanBase{

	public Program find(int programID){
		return em.find(Program.class, programID);
	}
	
	public List<Program> findAll(){
		Query q = em.createNamedQuery("Program.findAll");
		return (List<Program>)q.getResultList();
	}
}