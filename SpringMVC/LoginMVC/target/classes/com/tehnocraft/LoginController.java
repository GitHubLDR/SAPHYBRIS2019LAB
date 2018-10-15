package com.tehnocraft;


@Controller
public class LoginController
{
	@RequestMapping("/add", RequestMapping.GET)
		public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j,HttpServletRequest request,HttpServletResponse response)
		{
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		AddService as = new AddService();
		int k = as.add(i.j);
		
		ModelAndView mv = ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
			return mv;
		}
}
