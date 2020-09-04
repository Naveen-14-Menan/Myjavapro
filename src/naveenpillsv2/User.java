package naveenpillsv2;

import java.io.Serializable;

import javax.ws.rs.FormParam;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7087242626471889546L;

	@FormParam("uemail")
	private String uemail;
	
	@FormParam("uname")
	private String uname;
	
	@FormParam("ucontact")
	private String ucontact;
	
	@FormParam("ucountry")	
	private String ucountry;
	
	@FormParam("udob")
	private String udob;
	
	@FormParam("upwd")
	private String upwd;
	
	@FormParam("relation")
	private String relation;
	
	@FormParam("blood")
	private String blood;
	
	@FormParam("weight")
	private float weight;
	
	@FormParam("height")
	private float height;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String uemail, String uname, String ucontact, String ucountry, String udob, String upwd,
			String relation, String blood, float weight, float height) {
		super();
		this.uemail = uemail;
		this.uname = uname;
		this.ucontact = ucontact;
		this.ucountry = ucountry;
		this.udob = udob;
		this.upwd = upwd;
		this.relation = relation;
		this.blood = blood;
		this.weight = weight;
		this.height = height;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUcontact() {
		return ucontact;
	}

	public void setUcontact(String ucontact) {
		this.ucontact = ucontact;
	}

	public String getUcountry() {
		return ucountry;
	}

	public void setUcountry(String ucountry) {
		this.ucountry = ucountry;
	}

	public String getUdob() {
		return udob;
	}

	public void setUdob(String udob) {
		this.udob = udob;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Override
	public String toString() {
		return "User [uemail=" + uemail + ", uname=" + uname + ", ucontact=" + ucontact + ", ucountry=" + ucountry
				+ ", udob=" + udob + ", upwd=" + upwd + ", relation=" + relation + ", blood=" + blood + ", weight="
				+ weight + ", height=" + height + "]";
	}
	
}
