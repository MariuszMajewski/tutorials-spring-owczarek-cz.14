package pl.mrmario.tutorials.spring.owczarek.cz14;

import java.util.HashMap;
import java.util.Map;

public class DictionaryRepository {
	public Map<String,String> getMapValue(){
		Map<String,String> result = new HashMap<>();
		result.put("MrMario108", "To Ja");
		return result;
	}
	
}
