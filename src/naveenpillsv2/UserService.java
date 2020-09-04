package naveenpillsv2;



public class UserService {
	 private UserDao dao = new UserDao();
	public boolean addnuser(User user) {
		User usr=dao.saveuser(user);
		if(usr!=null) {
			return true;
		}else {
			return false;
		}
	}
	public String checkuser(String email, String pwd) {
		User usr=dao.loginverifyuser(email,pwd);
		if(usr==null) {
			return "0";
		}else if (usr.getUpwd().contentEquals(pwd)) {
			return usr.getUname();			
		}else{
			return "2";
		}
	}
	public User getUserService(String emailid) {
		User profile = dao.getUserDao(emailid);
		return profile;
	}
	public User updateUserService(User profile) {
		User uprofile= dao.updateUserDao(profile);
		return uprofile;
	}
	public boolean adddep(Dependent dependent) {
			Dependent d=dao.savedep(dependent);
			if(d!=null) {
				
				return false;		//meaning dependent already exist
			}
				
			else {
				System.out.println(dependent);
				return true;
			}
				
			
	}
	public Dependent getDependentService(String uemail,String relation) {
		Dependent dservice= dao.getDependentDao(uemail,relation);
		return dservice;
	}
	
}
