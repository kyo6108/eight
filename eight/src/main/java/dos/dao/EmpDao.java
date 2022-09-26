package dos.dao;

import dos.vo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Mapper
public interface EmpDao {

//    @Select(" select * from eight.user")
    List<Emp> getAll() throws Exception;
}
