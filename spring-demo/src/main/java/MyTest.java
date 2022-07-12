import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.InputStreamResource;

@SuppressWarnings("deprecation")
public class MyTest {
    public static void main(String[] args) {
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        MyTestBean bean = (MyTestBean) applicationContext.getBean("myTestBean");
        System.out.println("qiangpx: " + bean.getTestStr());
        XmlBeanFactory
    }
}
