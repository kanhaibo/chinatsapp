package servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.App;
import org.tempuri.InfoPic;

import com.alibaba.fastjson.JSON;

/**
 * 获取唐宋服务焦点图列表
 * 
 * */
public class GetTsServiceThumbPicServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 防止乱码
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// 调用WebService的相关方法
		App app = new App();
		InfoPic infoPic = app.getAppSoap().getTsServiceThumbPic();

		// 将结果对象转换成json字符串，true为格式化输出
		String jsonResult = JSON.toJSONString(infoPic, true);

		// test data
		System.out.println(jsonResult);

		// 将结果返回
		resp.getWriter().print(jsonResult);
		resp.getWriter().flush();
		resp.getWriter().close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		doGet(req, resp);
	}

}
