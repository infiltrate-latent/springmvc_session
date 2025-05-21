package controller;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.SessionAttributes; 
import org.springframework.web.bind.support.SessionStatus; 

@Controller
@RequestMapping("/book")
@SessionAttributes({"book","description"})
public class RedirectController {
	
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("book", "kiss my ass");
		model.addAttribute("description","suck my dick");
		model.addAttribute("price", new Double("1000.00"));
		//��ת֮ǰ�����ݱ��浽book��description��price�У���Ϊע��@SessionAttribute�����⼸������
		return "redirect:get";
	}
	
	@RequestMapping("/get")
	public String get(ModelMap model,SessionStatus sessionStatus){
		//���Ի��book��description��price�Ĳ���
		System.out.println(model.get("book")+";"+model.get("description")+";"+model.get("price"));
		sessionStatus.setComplete();
		return "redirect:complete";
	}
	
	@RequestMapping("/complete")
	public String complete(ModelMap modelMap){
		//�Ѿ���������޷���ȡbook��ֵ
		System.out.println(modelMap.get("book"));
		modelMap.addAttribute("book", "nipple");
		return "../loginSuccess";
	}
 
}