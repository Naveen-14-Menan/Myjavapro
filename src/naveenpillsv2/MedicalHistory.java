package naveenpillsv2;

import javax.ws.rs.FormParam;

public class MedicalHistory {
	@FormParam("illness")
	String illness;
	
	@FormParam("doctor")
	String doctor;
	
	@FormParam("sdate")
	String sdate;
	
	@FormParam("edate")
	String edate;
	
	@FormParam("doasgeamt")
	String doasgeamt;
	
	@FormParam("dosagefreq")
	String dosagefreq;
	
	@FormParam("dosagetime")
	String dosagetime;
	
	@FormParam("emailnotify")
	boolean emailnotify;
	
	
	
	
}
