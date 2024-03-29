package gr.hua.dit.DAO;

import java.util.List;
import gr.hua.dit.entity.Permissions;
import gr.hua.dit.entity.User;

public interface AdminDAO {
	//list of methods
	public void AddUser(String username,String password, short enabled,String role);	
	public void DeleteUser(String username);
	public void UpdateUser(String column,String newValue,String existUser);
	public List<User> GetUserTable();
	public List<Permissions> GetPermissionsTable();
	public void AddService(String service,String supervisor,String documentManager,String studentManager,String administrator);
	public void DeleteService(String service);
	public void UpdateService (String column, String newValue, String existService);
	public String CheckUser(String username);
	public User getUser(int id);
	public void saveRole(User user, String role);
}
