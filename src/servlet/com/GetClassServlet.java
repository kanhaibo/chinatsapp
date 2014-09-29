package servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.App;
import org.tempuri.DxPzInfo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * ����uid��ȡ���ķ���
 * 
 * */
public class GetClassServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ��ֹ����
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// ����������Ƽ���ʽ
		// getClass = {"uid":<value>,"classid":<value>,"levels":<value>}
		String jsonStr = req.getParameter("getClass");
		JSONObject jsonobj = JSON.parseObject(jsonStr);
		
		// ��ȡ�������
		String uid = jsonobj.getString("uid");
		String classid = jsonobj.getString("classid");
		String levels = jsonobj.getString("levels");

		// ����WebService����ط���
		App app = new App();
		DxPzInfo dxPzInfo = app.getAppSoap().getClass(uid, classid, levels);

		// ���������ת����json�ַ�����trueΪ��ʽ�����
		String jsonResult = JSON.toJSONString(dxPzInfo, true);

		// ���������
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
