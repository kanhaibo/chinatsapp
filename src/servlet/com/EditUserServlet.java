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
 * �����û����Ͻӿ�
 * 
 * */
public class EditUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ��ֹ����
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// ����������Ƽ���ʽ
		// editUser = {"uid":<value>,"username":<value>,"birthday":<value>,
		// "sex":<value>,"corporation":<value>,"profession":<value>,"email":<value>}
		String jsonStr = req.getParameter("editUser");
		JSONObject jsonobj = JSON.parseObject(jsonStr);

		// ��ȡ�������
		String uid = jsonobj.getString("uid");
		String username = jsonobj.getString("username");
		String birthday = jsonobj.getString("birthday");
		String sex = jsonobj.getString("sex");
		String corporation = jsonobj.getString("corporation");
		String profession = jsonobj.getString("profession");
		String email = jsonobj.getString("email");

		// ����WebService����ط���
		App app = new App();
		CM cm = app.getAppSoap().editUser(uid, username, birthday, sex,
				corporation, profession, email);

		// ���������ת����json�ַ�����trueΪ��ʽ�����
		String jsonResult = JSON.toJSONString(cm, true);

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
