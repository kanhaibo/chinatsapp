package servlet.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.App;
import org.tempuri.Reply;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * ��ȡ���۽ӿ�
 * 
 * */
public class GetReplyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ��ֹ����
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// ����������Ƽ���ʽ
		// getReply = {"uid":<value>,"typeid":<value>,"infoid":<value>}
		String jsonStr = req.getParameter("getReply");
		JSONObject jsonobj = JSON.parseObject(jsonStr);

		// ��ȡ�������
		String uid = jsonobj.getString("uid");
		String typeid = jsonobj.getString("typeid");
		String infoid = jsonobj.getString("infoid");

		// ����WebService����ط���
		App app = new App();
		Reply reply = app.getAppSoap().getReply(uid, typeid, infoid);

		// ���������ת����json�ַ�����trueΪ��ʽ�����
		String jsonResult = JSON.toJSONString(reply, true);

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
