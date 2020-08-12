import com.company.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 鲁佳磊
 * @create 2020-08-12 17:23
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
        bean.test();


    }
}
