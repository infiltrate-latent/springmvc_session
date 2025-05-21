package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;
import entity.User;
import entity.Dog1;

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
	public Dog1 getDog()
	{
		Dog1 dog= new Dog1();
		dog.setAge(18);
		dog.setName("bb");
		return  dog;
	}

//	@ModelAttribute("myuser")
//	public User getUser()
//	{
//		User user= new User();
//		user.setUname("aa");
//		user.setPwd("aapwd");
//		return  user;
//	}
	
	@RequestMapping("/vv")  
    public String login(User user2,Model model) {
        //user���Լ�ע��session��  
        //��uname����session�������У�����ת��ҳ��Ҳ����ȡ��������ݡ�
		System.out.println(user2);
		model.addAttribute("uname",user2.getUname());
		model.addAttribute("user1",user2);
        System.out.println("user.getPwd()"+user2.getPwd());
        return "loginSuccess";  
    }  
}  