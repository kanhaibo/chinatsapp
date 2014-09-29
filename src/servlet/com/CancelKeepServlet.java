package servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.tempuri.App;
import org.tempuri.CM;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * ȡ���ղ�
 * 
 * */
public class CancelKeepServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ��ֹ����
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// ����������Ƽ���ʽ
		// cancelKeep = {"uid":<value>,"classid":<value>,"infoid":<value>}
		String jsonStr = req.getParameter("cancelKeep");
		JSONObject jsonobj = JSON.parseObject(jsonStr);

		// ��ȡ�������
		String uid = jsonobj.getString("uid");
		String classid = jsonobj.getString("classid");
		String infoid = jsonobj.getString("infoid");

		// ����WebService����ط���
		App app = new App();
		CM cm = app.getAppSoap().cancelKeep(uid, classid, infoid);

		// ���������ת����json�ַ�����trueΪ��ʽ�����
		String jsonResult = JSON.toJSONString(cm, true); 

		//���������
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
