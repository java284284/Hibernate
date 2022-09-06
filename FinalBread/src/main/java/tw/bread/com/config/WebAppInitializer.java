package tw.bread.com.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//�۷��web.xml��java�{���պA
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override // �Ψӳ]�w�۷��beans.config.xml or application.xml��java�{���պA���O
	protected Class<?>[] getRootConfigClasses() {
//		return null;
		return new Class[] { RootAPPConfig.class };
	}

	@Override // �Ψӳ]�w�۷��mvc-servlet.xml��java�{���պA���O
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebAppConfig.class };
//		return null;
	}

	@Override // �Ψӳ]�wDispathcerServlet URL Pattern
	protected String[] getServletMappings() {
		return new String[] { "/" };
//		return null;
	}

	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodeFilter = new CharacterEncodingFilter("UTF-8", true);
		return new Filter[] { encodeFilter };
	}

}
