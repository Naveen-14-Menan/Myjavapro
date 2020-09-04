package naveenpillsv2;

import java.util.HashMap;
import java.util.Set;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Dummy1 {
	static HashMap<String, HM>headmap=new HashMap<String, HM>();
	static HashMap<String, Teacher>teachermap=new HashMap<String, Teacher>();
	static HashMap<String, Student>studentmap=new HashMap<String, Student>();
	public static void main(String[] args) {
		//Dimly
		HM h1=new HM();
		h1.setHmname("hn1");
		h1.setHmdata("h1");
		
	
		
		Teacher t1=new Teacher();
		t1.setTname("tn1");
		t1.setTdata("t1");
		
		Teacher t2=new Teacher();
		t2.setTname("tn2");
		t2.setTdata("t2");
		
		Student s1=new Student("sn1","s1");
		Student s2=new Student("sn2","s2");
		
		studentmap.put("sn1", s1);
		studentmap.put("sn2", s2);
		t1.setStu(studentmap);
		Student s3=new Student("sn3","s3");
		Student s4=new Student("sn4","s4");
		studentmap.put("sn3", s3);
		studentmap.put("sn4", s4);
		t2.setStu(studentmap);
		teachermap.put("tn1", t1);
		teachermap.put("tn2", t2);
		h1.setTeach(teachermap);
		
		Student s7=new Student("sn7","s7");
		Student s8=new Student("sn8","s8");
		
		HM h11=hmcontroll("h1",t1,s7);
		h11.disp();
		HM h22=hmcontroll("hn1",t1,s8);
		h11.disp();
		HM h33=hmcontroll("hn1",t2,s7);
		h33.disp();
		HM h44=hmcontroll("hn1",t2,s8);
		h44.disp();
		
		
		
		
	}
	private static HM hmcontroll(String h,Teacher t,Student s) {
		return hmservice(h,t,s);
		
	}
	private static HM hmservice(String h,Teacher t,Student s) {
		
		return hmdao(h,t,s);
		
	}
	private static HM hmdao(String h,Teacher t,Student s) {
		
		
		 HM med=headmap.get(h); 
		 HashMap<String, Teacher> medt =med.getTeach(); 
		 Teacher medtecobj=medt.get(t.getTname());
		 
		 HashMap<String, Student> medstudentmap=medtecobj.getStu(); 
		 medstudentmap.putIfAbsent(s.getSname(), s);
		 
		//((((headmap.get(h)).getTeach()).get(t)).getStu()).putIfAbsent(s.getSname(), s);
		/*
		 * tt.setStu(studentmap); teachermap.putIfAbsent(t, tt); headmap.putIfAbsent(h,
		 * hh);
		 */
		
		return med;
	}

	

	
}
class HM{
	String hmname;
	String hmdata;
	HashMap<String, Teacher>teach;
	public String getHmname() {
		return hmname;
	}
	public void setHmname(String hmname) {
		this.hmname = hmname;
	}
	public String getHmdata() {
		return hmdata;
	}
	public void setHmdata(String hmdata) {
		this.hmdata = hmdata;
	}
	public HashMap<String, Teacher> getTeach() {
		return teach;
	}
	public void setTeach(HashMap<String, Teacher> teach) {
		this.teach = teach;
	}
	@Override
	public String toString() {
		return "HM [hmname=" + hmname + ", hmdata=" + hmdata + "]";
	}
	public String disp() {
			Set<String> ke=this.teach.keySet();
			for (String k : ke)
			{					
				Set<String> ie=this.teach.get(k).getStu().keySet();
				for (String i : ie)
				{
					System.out.println(toString()+"under "+k+" : "+this.teach.get(k)+"under " +i+" : "+this.teach.get(k).getStu().get(i));
			   
				}
				
			}
		return null;
	}
	
	
	
}
class Teacher{
	String tname;
	String tdata;
	HashMap<String, Student>stu;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdata() {
		return tdata;
	}
	public void setTdata(String tdata) {
		this.tdata = tdata;
	}
	public HashMap<String, Student> getStu() {
		return stu;
	}
	public void setStu(HashMap<String, Student> stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Teacher [tname=" + tname + ", tdata=" + tdata + "]";
	}
	
	
}
class Student{
	String sname;
	String sdata;
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSdata() {
		return sdata;
	}

	public void setSdata(String sdata) {
		this.sdata = sdata;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String sdata) {
		super();
		this.sname = sname;
		this.sdata = sdata;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sdata=" + sdata + "]";
	}
	
	
}

