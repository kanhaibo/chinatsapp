package servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.App;
import org.tempuri.Dxmsglist;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 钢铁时讯搜索接口
 * 
 * */
public class GetSearchSteelMsgListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 防止乱码
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// 请求参数名称及格式
		// getSearchSteelMsgList =
		// {"uid":<value>,"classid":<value>,"keyword":<value>,"pages":<value>,"pageNum":<value>}
		String jsonStr = req.getParameter("getSearchSteelMsgList");
		JSONObject jsonobj = JSON.parseObject(jsonStr);

		// test data
		System.out.println(jsonobj);

		// 获取请求参数
		String uid = jsonobj.getString("uid");
		String classid = jsonobj.getString("classid");
		String keyword = jsonobj.getString("keyword");
		String pages = jsonobj.getString("pages");
		String pageNum = jsonobj.getString("pageNum");

		// 调用WebService的相关方法
		App app = new App();
		Dxmsglist dxmsgList = app.getAppSoap().getSearchSteelMsgList(uid,
				classid, keyword, pages, pageNum);

		// 将结果对象转换成json字符串，true为格式化输出
		String jsonResult = JSON.toJSONString(dxmsgList, true);

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
