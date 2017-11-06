/**
 * author: Feng Bo
 *
 * date: Nov 6, 2017
 */
package guru.springframework.api.domain;

import java.util.List;

public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
