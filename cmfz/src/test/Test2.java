import com.baizhi.App;
import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by skl on 2018/6/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class Test2 {
    @Autowired
    private AdminDao adminDao;
    @Test
    public void modiy(){
        Admin admin = new Admin(1, null, "123");
        adminDao.modfiy(admin);
    }
}
