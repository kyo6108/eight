package line;

import dos.dao.EmpDao;
import dos.vo.Emp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

;

@RestController
@Component
@RequestMapping("/api")
public class LineBotController {
  private static final Logger log = LoggerFactory.getLogger(LineBotController.class);

  @Autowired private EmpDao empDao;

  @CrossOrigin(origins = "http://localhost:8080")
  @GetMapping("/test")
  public void test() {
    try {
      List<Emp> e = empDao.getAll();

      if (e.isEmpty()) {
        System.out.println("空");

      } else {
        System.out.println(e.get(0).toString());
        System.out.println("not null");

//        log.info("result , name :{}", e.get(0).getUserName());
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
      System.out.println("error ->" + e.getMessage());
    }
  }
}
