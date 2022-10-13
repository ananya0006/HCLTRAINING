package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.MyConfig;
import com.av.dto.Branch;

public class TestBranch {
public static void main(String[] args) {
	 ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	 Branch br = (Branch) context.getBean("branch");
	 //method present in branch
	 br.details();
	 //method present in address
	 br.a.displayAddress();

}
}
