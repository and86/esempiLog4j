package it.alfasoft.andrea;



import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService(name="andreaFattura", serviceName="Fatture")
public class FatturaService implements IFatturaService {
	
	static Logger logger=Logger.getLogger(FatturaService.class); 
	
	@WebMethod
	public Fattura[] prendiTutteFatture(){
		logger.info("Sono entrato in tutte fatture");
		FatturaDao fDao=new FatturaDao();
		return fDao.getTutteFatture();
	}
	
	@WebMethod
	public Fattura prendiFatturaConCodice(String codice){
		FatturaDao fDao=new FatturaDao();
		return fDao.getFatturaConCodiceCliente(codice);
	}

}
