/**
 * 
 */
package core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import repository.ListRepository;

@Component
public class DatabaseLoader {
	private final ListRepository lists;

@Autowired
public DatabaseLoader(ListRepository lists) {
	this.lists= lists;
}

public void run(ApplicationArguments args) throws Exception {
System.out.println("App runner is running.");

}



	





}
