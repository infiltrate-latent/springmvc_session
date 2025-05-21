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
		//跳转之前将数据保存到book、description和price中，因为注解@SessionAttribute中有这几个参数
		return "redirect:get";
	}
	
	@RequestMapping("/get")
	public String get(ModelMap model,SessionStatus sessionStatus){
		//可以获得book、description和price的参数
		System.out.println(model.get("book")+";"+model.get("description")+";"+model.get("price"));
		sessionStatus.setComplete();
		return "redirect:complete";
	}
	
	@RequestMapping("/complete")
	public String complete(ModelMap modelMap){
		//已经被清除，无法获取book的值
		System.out.println(modelMap.get("book"));
		modelMap.addAttribute("book", "nipple");
		return "../loginSuccess";
	}
 
}