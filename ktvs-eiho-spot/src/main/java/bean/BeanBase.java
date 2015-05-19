package bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BeanBase {

	@PersistenceContext
    protected EntityManager em;

	public void insert(Object Entity){
		em.persist(Entity);
	}

	public void update(Object Entity){
		em.merge(Entity);
	}

	public void delete(Object Entity){
		em.remove(em.merge(Entity));
	}
}