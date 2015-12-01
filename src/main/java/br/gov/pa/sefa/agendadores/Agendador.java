package br.gov.pa.sefa.agendadores;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

import br.gov.pa.sefa.persistencia.MantisDAO;
import br.gov.pa.sefa.persistencia.PlaySound;

@Stateless
public class Agendador {
	
	@EJB
	private MantisDAO mantisDAO;
		
	@Schedule(second="*/30",minute="*",hour="*", persistent=false)
	public void leitorMantis(){		
		if (mantisDAO.existeMantis()){
			new PlaySound().playSound();
		}
	}
}
