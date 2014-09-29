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
 * ��ȡ�û��ղصĸ���ʱѶ�б�
 * 
 * */
public class GetSteelKeepListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// ��ֹ����
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");

		// ����������Ƽ���ʽ
		// getSteelKeepList = {"uid":<value>,"pages":<value>,"pageNum":<value>}
		String jsonStr = req.getParameter("getSteelKeepList");
		JSONObject jsonobj = JSON.parseObject(jsonStr);

		// test data
		System.out.println(jsonobj);

		// ��ȡ�������
		String uid = jsonobj.getString("uid");
		String pages = jsonobj.getString("pages");
		String pageNum = jsonobj.getString("pageNum");

		// ����WebService����ط���
		App app = new App();
		Dxmsglist dxmsglist = app.getAppSoap().getSteelKeepList(uid, pages,
				pageNum);

		// ���������ת����json�ַ�����trueΪ��ʽ�����
		String jsonResult = JSON.toJSONString(dxmsglist, true); // ������ת����json�ַ�����trueΪ��ʽ�����

		// test data
		System.out.println(jsonResult);

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
