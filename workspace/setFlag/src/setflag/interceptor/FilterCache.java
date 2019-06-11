package setflag.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class FilterCache implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) resp; response.setHeader("Access-Control-Allow-Origin", "*"); //解决跨域访问报错   
	    response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");   
	    response.setHeader("Access-Control-Max-Age", "3600"); //设置过期时间   
	    response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, client_id, uuid, Authorization");
	    response.setHeader("Cache-Control", "max-age=604800"); // 支持HTTP 1.1.   
	    response.setHeader("Acess-Control-Allow-Credentials", "true"); //设置证书
	    chain.doFilter(request, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
