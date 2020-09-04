package naveenpillsv2;



import java.util.Arrays;

public class Dummy {
	public static void main(String[] args) {

		UserP userP = new UserP();
		userP.setUpemailid("naushad1@gmail.com");
		userP.setUpname("Naushad Akhtar");

		DependentP self = new DependentP("Naushad", userP.getUpemailid(), "Self", "self1@gmail.com");
		DependentP brother = new DependentP("Taha", userP.getUpemailid(), "Brother", "bro1@gmail.com");
		DependentP sister = new DependentP("Rekha", userP.getUpemailid(), "Sister", "sis1@gmail.com");

		MedHist mhist1 = new MedHist(self.getDpemailid(), "Dr. Bhansla", "Blood Pressure", "Pencilin");
		MedHist mhist2 = new MedHist(self.getDpemailid(), "Dr. Kohli", "Sugar", "Paramol");

		self.setMh(mhist1, mhist2);

		userP.setDp(self, brother, sister);

		dislay(userP);
	}

	private static void dislay(UserP userP) {
		DependentP dp[] = userP.getDp();
		for (DependentP dpp : dp) {
			System.out.println(userP.getUpname() + "\t" + dpp.getDpemailid() + "\t" + dpp.getDpname());
			MedHist mh[] = dpp.getMh();
			if (mh == null) {
				System.out.println("No Medical History");
			} else {
				for (MedHist mhh : mh) {
					System.out.println(mhh.getDpemailid() + "\t" + mhh.getDoctorname() + "\t" + mhh.getDesease());
				}
			}
			System.out.println("=========================================");
		}
		// System.out.println(mh);
	}
}
class UserP {
	private String upemailid;
	private String upname;
	private DependentP dp[];

	public UserP() {
	}

	public UserP(String upemailid) {
		super();
		this.upemailid = upemailid;

	}

	public String getUpname() {
		return upname;
	}

	public void setUpname(String upname) {
		this.upname = upname;
	}

	public String getUpemailid() {
		return upemailid;
	}

	public void setUpemailid(String upemailid) {
		this.upemailid = upemailid;
	}

	public DependentP[] getDp() {
		return dp;
	}

	public void setDp(DependentP... dp) {
		this.dp = dp;
	}

	@Override
	public String toString() {
		return "UserP [upemailid=" + upemailid + ", upname=" + upname + ", dp=" + Arrays.toString(dp) + "]";
	}

}

class DependentP {
	private String upemailid;
	private String dpType;
	private String dpemailid;
	private String dpname;

	private MedHist mh[];

	/*
	 * public DependentP() { }
	 */

	public DependentP(String dpname, String upemailid, String dpType, String dpemailid) {
		super();
		this.dpname = dpname;
		this.upemailid = upemailid;
		this.dpType = dpType;
		this.dpemailid = dpemailid;
	}

	public DependentP(String upemailid, String dpType, String dpemailid, MedHist[] mh) {
		super();
		this.upemailid = upemailid;
		this.dpType = dpType;
		this.dpemailid = dpemailid;
		this.mh = mh;
	}

	public String getDpname() {
		return dpname;
	}

	public void setDpname(String dpname) {
		this.dpname = dpname;
	}

	public String getUpemailid() {
		return upemailid;
	}

	public void setUpemailid(String upemailid) {
		this.upemailid = upemailid;
	}

	public String getDpType() {
		return dpType;
	}

	public void setDpType(String dpType) {
		this.dpType = dpType;
	}

	public String getDpemailid() {
		return dpemailid;
	}

	public void setDpemailid(String dpemailid) {
		this.dpemailid = dpemailid;
	}

	public MedHist[] getMh() {
		return mh;
	}

	public void setMh(MedHist... mh) {
		this.mh = mh;
	}

	@Override
	public String toString() {
		return "DependentP [upemailid=" + upemailid + ", dpType=" + dpType + ", dpemailid=" + dpemailid + ", dpname="
				+ dpname + ", mh=" + Arrays.toString(mh) + "]";
	}

}

class MedHist {

	private String dpemailid;
	private String Doctorname;
	private String desease;
	private String medicine;

	public MedHist() {
		// TODO Auto-generated constructor stub
	}

	public MedHist(String dpemailid, String doctorname, String desease, String medicine) {
		super();
		this.dpemailid = dpemailid;
		Doctorname = doctorname;
		this.desease = desease;
		this.medicine = medicine;
	}

	public MedHist(String dpemailid2) {
		// TODO Auto-generated constructor stub
	}

	public String getDpemailid() {
		return dpemailid;
	}

	public void setDpemailid(String dpemailid) {
		this.dpemailid = dpemailid;
	}

	public String getDoctorname() {
		return Doctorname;
	}

	public void setDoctorname(String doctorname) {
		Doctorname = doctorname;
	}

	public String getDesease() {
		return desease;
	}

	public void setDesease(String desease) {
		this.desease = desease;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	@Override
	public String toString() {
		return "MedHist [dpemailid=" + dpemailid + ", Doctorname=" + Doctorname + ", desease=" + desease + ", medicine="
				+ medicine + "]";
	}

}
