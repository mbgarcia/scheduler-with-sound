package br.gov.pa.sefa.agendadores;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

import br.gov.pa.sefa.persistencia.MantisDAO;

@Stateless
public class Agendador {
	
	@EJB
	private MantisDAO mantisDAO;
	
	@Schedule(second="*/30",minute="*",hour="*", persistent=false)
	public void leitorMantis(){		
		System.out.println("TESTE: " + mantisDAO.existeMantis());
	}
}
