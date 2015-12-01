package br.gov.pa.sefa.persistencia;

import java.awt.Toolkit;
import java.math.BigDecimal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MantisDAO {
	
	@PersistenceContext
	EntityManager manager;
	
	public boolean existeMantis(){
		StringBuilder sql = new StringBuilder("select count(*) ");
		sql.append(" from mantis.mantis_bug_tb t ")
		.append(" where t.status = :novo")
		.append(" and t.status = :novo");
		BigDecimal qtd = (BigDecimal) manager.createNativeQuery(sql.toString())
				.setParameter("novo", 10)
				.setParameter("novo", 10)
				.getSingleResult();
		
		Toolkit.getDefaultToolkit().beep();
		
		return qtd.longValue() > 0 ? true:false;
	}
}
