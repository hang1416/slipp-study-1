package net.slipp.user;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class UserServiceHelper {
	private static final String USERSERVICE_BEANID = "userService";

	public static UserService getUserService(ServletContext ctx) {
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(ctx);

		return (UserService) wac.getBean(USERSERVICE_BEANID);
	}
}
