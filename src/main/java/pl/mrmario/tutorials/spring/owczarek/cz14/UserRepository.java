package pl.mrmario.tutorials.spring.owczarek.cz14;

public class UserRepository {
public boolean exists(String userName) {
	if(userName.equals("MrMario108"))
		return true;
	else
		return false;
}
}
