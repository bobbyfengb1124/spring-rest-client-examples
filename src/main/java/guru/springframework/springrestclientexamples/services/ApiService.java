/**
 * author: Feng Bo
 *
 * date: Nov 6, 2017
 */
package guru.springframework.springrestclientexamples.services;

import java.util.List;
import guru.springframework.api.domain.User;

public interface ApiService {

	List<User> getUsers(Integer limit); 
}
