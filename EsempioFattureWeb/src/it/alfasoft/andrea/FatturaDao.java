package it.alfasoft.andrea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class FatturaDao {
	final static Logger logger=Logger.getLogger(FatturaDao.class);

	private Map<String,Fattura> fatture;
//	private Fattura []arr;

	public FatturaDao() {
		
		
		fatture=new HashMap<>();
		Fattura f1=new Fattura("aaa",100,"alfasoft");
		Fattura f2=new Fattura("bbb",123.5,"IBM");
		Fattura f3=new Fattura("ccc",364,"reply");
		Fattura f4=new Fattura("ddd",987,"rgi");
		
		fatture.put(f1.getCodiceCliente(), f1);
		fatture.put(f2.getCodiceCliente(), f2);
		fatture.put(f3.getCodiceCliente(), f3);
		fatture.put(f4.getCodiceCliente(), f4);
		
	}
	
public Fattura[] getTutteFatture() {
		
	List<Fattura> lista = new ArrayList<Fattura>(fatture.values());
	
	Fattura[] array = lista.toArray(new Fattura[lista.size()]);
	return array;
		
	}
public Fattura getFatturaConCodiceCliente(String codice){
	
	if(fatture.get(codice)==null){
		logger.error(codice+" Non esisteva");
		
	}
	return fatture.get(codice);
}
	
	
} 
