package dos.vo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/** Line Bot 測試用 */
@Component
@Repository
public class Emp implements Serializable, Cloneable {
  private String userName;
  private Long userId;

  //    public Emp(String userName, Long userId) {
  //        this.userName = userName;
  //        this.userId = userId;
  //    }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "userName='" + userName + '\'' +
            ", userId=" + userId +
            '}';
  }
}
