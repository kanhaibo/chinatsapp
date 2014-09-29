package servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.App;
import org.tempuri.CMD;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * �������۽ӿ�
 * 
 * */
public class SetReplyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ��ֹ����
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// ����������Ƽ���ʽ
		// setReply =
		// {"uid":<value>,"typeid":<value>,"infoid":<value>,"content":<value>}
		String jsonStr = req.getParameter("setReply");
		JSONObject jsonobj = JSON.parseObject(jsonStr);

		// ��ȡ�������
		String uid = jsonobj.getString("uid");
		String typeid = jsonobj.getString("typeid");
		String infoid = jsonobj.getString("infoid");
		String content = jsonobj.getString("content");

		// ����WebService����ط���
		App app = new App();
		CMD cmd = app.getAppSoap().setReply(uid, typeid, infoid, content);

		// ���������ת����json�ַ�����trueΪ��ʽ�����
		String jsonResult = JSON.toJSONString(cmd, true);

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
