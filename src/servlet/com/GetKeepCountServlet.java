package servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.App;
import org.tempuri.KeepCount;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * �û��ղ�ͳ��
 * 
 * */
public class GetKeepCountServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ��ֹ����
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// ����������Ƽ���ʽ
		// getKeepCount = {"uid":<value>}
		String jsonStr = req.getParameter("getKeepCount");
		JSONObject jsonobj = JSON.parseObject(jsonStr);

		// ��ȡ�������
		String uid = jsonobj.getString("uid");

		// ����WebService����ط���
		App app = new App();
		KeepCount keepCount = app.getAppSoap().getKeepCount(uid);

		// ���������ת����json�ַ�����trueΪ��ʽ�����
		String jsonResult = JSON.toJSONString(keepCount, true);

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
