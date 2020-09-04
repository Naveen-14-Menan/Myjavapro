package naveenpillsv2;

import java.util.HashMap;







public class UserDao {
	static HashMap<String, User> userprofilemap;
	static HashMap<String, HashMap<String, Dependent>> dependents;
	static HashMap<String, Dependent> subDependent;
	static {
		userprofilemap=new HashMap<String, User>();
		subDependent=new HashMap<String, Dependent>();
		dependents =new HashMap<String, HashMap<String,Dependent>>();
		User defaultprofile = new User("naveen@gmail.com","naveen","9867534210","Bhutan","15/08/1947","naveen","self","B+",68,170);
		userprofilemap.put("naveen@gmail.com", defaultprofile);
		Dependent defaultDependent = new Dependent("naveen@gmail.com","naveen@gmail.com","naveen","9586324710","31/08/2020","self","B+",65,169);
		subDependent.put("self", defaultDependent);
		dependents.put("naveen@gmail.com", subDependent);
		
		
		
	}
	public User saveuser(User user) {

		User status =userprofilemap.putIfAbsent(user.getUemail(), user);
		return status;
	}
	public User loginverifyuser(String email, String pwd) {
		User result = userprofilemap.get(email);
		
			return result;
		
	}
	public User getUserDao(String emailid) {
		return userprofilemap.get(emailid);
	}
	public User updateUserDao(User profile) {
		User uprofile=  userprofilemap.put(profile.getUemail(), profile);
		
		/*Dependent d=new Dependent();
		d.setUsemail(profile.getUemail());
		d.setDemail(profile.getUemail());
		d.setDname(profile.getUname());
		d.setDcontact(profile.getUcontact());
		d.setDblood(profile.getBlood());
		d.setDdob(profile.getUdob());
		d.setRelation("self");
		d.setDweight(profile.getWeight());
		d.setDheight(profile.getHeight());
		savedep(d);*/
		return uprofile;

	}
	public Dependent savedep(Dependent dependent) {
		HashMap<String , Dependent> ndep= dependents.get(dependent.getUsemail());
		Dependent returnDependent = null;
		if(ndep == null) {
			 ndep =new HashMap<String, Dependent>();
			 ndep.put(dependent.getRelation(),dependent);	
			 System.out.print(dependent.getRelation()+" is maped to ");
			 System.out.print(dependent);
		}else {
			returnDependent=ndep.putIfAbsent(dependent.getRelation(), dependent);
			 System.out.print(dependent.getRelation()+" is maped to ");
			 System.out.print(returnDependent);
		}
		dependents.put(dependent.getUsemail(), ndep);
		
		return returnDependent;
	}
	public Dependent getDependentDao(String uemail,String relation) {
		Dependent dDao=dependents.get(uemail).get(relation);
		
		return dDao;
	}
	
}
