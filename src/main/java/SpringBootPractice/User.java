package SpringBootPractice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;
    public User() {
    	
    	id = 0;
    	name = "";
    	email = "";
    	
    }
	public User(String name2, String string) {
		// TODO Auto-generated constructor stub
		name = name2;
		email = string;
	}
	
	// standard constructors / setters / getters / toString
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "User{id="+id+", name="+name+", email="+email+"}";
	}
     
    

}
