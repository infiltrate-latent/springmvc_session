package controller;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.SessionAttributes;  
import entity.User;
import entity.Dog;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestBody;

@Controller  
//@SessionAttributes({"user","uname"})
//@SessionAttributes({"user","uname"})
public class LoginController {  

	/*@ModelAttribute
	public void getUser(Map<String,User> map)
	{
//		User user=new User();
//		 System.out.println(user.getUname());
		 map.put("user", new User());
	}*/
	
	/*@ModelAttribute
	public void getUser(Model model)
	{
		User user=new User();
		 
//		 System.out.println(user.getUname());
//		 map.put("user", new User());
//		map.put("user", user);
		model.addAttribute("user", user);
		System.out.println("shit"+user.getUname());
		model.addAttribute("uname", user.getUname());
//		model.addAttribute("uname", "big dick");
	   	}*/
	
	@ModelAttribute
	public Dog getDog()
	{
		Dog dog= new Dog();
		dog.setAge(18);
		dog.setName("aa");
		return  dog;
	}

	@ModelAttribute
	public User getUser()
	{
		User user= new User();
		user.setUname("aa");
		user.setPwd("aapwd");
		return  user;
	}
	
	@RequestMapping("/vv")  
    public String login(User user,Model model) {  
        //user���Լ�ע��session��  
        //��uname����session�������У�����ת��ҳ��Ҳ����ȡ��������ݡ�
		System.out.println(user);
		model.addAttribute("uname",user.getUname());
		model.addAttribute("user1",user);
        System.out.println("user.getPwd()"+user.getPwd());
        return "loginSuccess";  
    }  
}  