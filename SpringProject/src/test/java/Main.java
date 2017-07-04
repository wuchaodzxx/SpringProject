import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springmvc.config.Dog;
import com.springmvc.config.SpringConfig;

public class Main {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext���췽���������һ������ע���࣬ע������ʹ��@Bean�����˶��Bean
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext ();
		//context.register(Bean01.class);
		context.scan("com.springmvc.config");
		context.refresh();
	    Dog dog = context.getBean(Dog.class);
	    dog.bark();
	}

}
