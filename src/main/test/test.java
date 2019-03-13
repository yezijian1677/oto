import com.o2o.dao.AreaDao;
import com.o2o.entity.Area;
import com.o2o.service.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public class test extends BaseTest {

   @Autowired
   private AreaDao areaDao;


    @Test
    public void test(){
        areaDao.queryArea().toString();
    }
}
