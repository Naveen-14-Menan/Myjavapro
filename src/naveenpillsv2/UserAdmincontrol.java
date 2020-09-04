package naveenpillsv2;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@Path("user")
public class UserAdmincontrol {
	@POST
	@Path("adduser")
	public String adduser(@BeanParam User user) {
		UserService nservice = new UserService();
		boolean r = nservice.addnuser(user);
		if(r) {
			System.out.println(user);
			return "User Saved";
		}
		return "User Not Saved";
		
	}
	@POST
	@Path("login")
	public String login(@FormParam("uemail") String email, @FormParam("upwd") String pwd) {
		UserService cservice = new UserService();
		String name = cservice.checkuser(email,pwd);
		
		return name;
		
	}
	
	@GET
	@Path("edituser/{emailid}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("emailid") String emailid) {
		UserService userService = new UserService();
		User profile = userService.getUserService(emailid);
		System.out.println(profile + " controller");
		return profile;
	}
	
	@PUT
	@Path("updateuser") 
	public String updateUser(@BeanParam User profile) {
		UserService userService = new UserService();
		User u =  userService.updateUserService(profile);
		if(u!= null) {
			return "User profile updated";
		}
		return "0";
	}
	@POST
	@Path("adddependent")
	public String adddependent(@BeanParam Dependent dependent) {
		UserService dservice = new UserService();
		boolean res=dservice.adddep(dependent);
		if(res) {
			System.out.println(dependent);
			return "Dependent saved";
			
		}
		return "dependent_exist";		
	}
	@GET
	@Path("viewDependent/{emailid}/{relation}")
	@Produces(MediaType.APPLICATION_JSON)
	public Dependent getDependent(@PathParam("emailid") String emailid, @PathParam("relation") String relation) {
		UserService userService = new UserService();
		Dependent DependentProfile = userService.getDependentService(emailid,relation);
		System.out.println(DependentProfile + " is got to view dependent");
		return DependentProfile;
	}
	
}
