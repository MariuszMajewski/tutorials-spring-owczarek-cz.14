package pl.mrmario.tutorials.spring.owczarek.cz14;

public class Application {
	private UserRepository userRepository;
	private DictionaryRepository dictionaryRepository;
	
	
	public UserRepository getUserRepository() {
		return userRepository;
	}
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public DictionaryRepository getDictionaryRepository() {
		return dictionaryRepository;
	}
	public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
		this.dictionaryRepository = dictionaryRepository;
	}
	
	
}
