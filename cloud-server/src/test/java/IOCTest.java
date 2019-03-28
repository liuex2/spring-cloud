import com.spring.cloud.server.entity.Actor;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.alibaba.fastjson.JSON;

/**
 *
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Application.class)
public class IOCTest {

    @Test
    public void test1(){
        //同时创建容器及对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
//        Object bean = ioc.getBean("actor");
//        Actor bean = ioc.getBean(Actor.class);
        Actor bean = ioc.getBean("actor1",Actor.class);
        System.out.println("bean="+JSON.toJSONString(bean));
    }

}
