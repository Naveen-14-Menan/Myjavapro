package naveenpillsv2;

import javax.ws.rs.FormParam;

public class Dependent {
	@FormParam("usemail")
	private String usemail;
	
	@FormParam("demail")
	private String demail;
	
	@FormParam("dname")
	private String dname;
	
	@FormParam("dcontact")
	private String dcontact;
	
	@FormParam("ddob")
	private String ddob;
	
	@FormParam("relation")
	private String relation;
	
	@FormParam("dblood")
	private String dblood;
	
	@FormParam("dweight")
	private float dweight;
	
	@FormParam("dheight")
	private float dheight;

	public Dependent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dependent(String usemail, String demail, String dname, String dcontact, String ddob, String relation,
			String dblood, float dweight, float dheight) {
		super();
		this.usemail = usemail;
		this.demail = demail;
		this.dname = dname;
		this.dcontact = dcontact;
		this.ddob = ddob;
		this.relation = relation;
		this.dblood = dblood;
		this.dweight = dweight;
		this.dheight = dheight;
	}

	public String getUsemail() {
		return usemail;
	}

	public void setUsemail(String usemail) {
		this.usemail = usemail;
	}

	public String getDemail() {
		return demail;
	}

	public void setDemail(String demail) {
		this.demail = demail;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDcontact() {
		return dcontact;
	}

	public void setDcontact(String dcontact) {
		this.dcontact = dcontact;
	}
	public String getDdob() {
		return ddob;
	}

	public void setDdob(String ddob) {
		this.ddob = ddob;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getDblood() {
		return dblood;
	}

	public void setDblood(String dblood) {
		this.dblood = dblood;
	}

	public float getDweight() {
		return dweight;
	}

	public void setDweight(float dweight) {
		this.dweight = dweight;
	}

	public float getDheight() {
		return dheight;
	}

	public void setDheight(float dheight) {
		this.dheight = dheight;
	}

	@Override
	public String toString() {
		return "Dependent [usemail=" + usemail + ", demail=" + demail + ", dname=" + dname + ", dcontact=" + dcontact
				+ ", ddob=" + ddob + ", relation=" + relation + ", dblood=" + dblood + ", dweight=" + dweight
				+ ", dheight=" + dheight + "]";
	}
	
	

}
