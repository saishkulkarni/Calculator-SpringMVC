package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator1 {
	@GetMapping("add1")
	public String add(@RequestParam double x, @RequestParam double y, ModelMap map) {
		map.put("x", x);
		map.put("y", y);
		map.put("z", (x + y));
		return "Calculator1.jsp";
	}
	
	@GetMapping("sub1")
	public String sub(@RequestParam double x, @RequestParam double y, ModelMap map) {
		map.put("x", x);
		map.put("y", y);
		map.put("z", (x - y));
		return "Calculator1.jsp";
	}
	
	@GetMapping("mul1")
	public String mul(@RequestParam double x, @RequestParam double y, ModelMap map) {
		map.put("x", x);
		map.put("y", y);
		map.put("z", (x * y));
		return "Calculator1.jsp";
	}
	
	@GetMapping("div1")
	public String div(@RequestParam double x, @RequestParam double y, ModelMap map) {
		map.put("x", x);
		map.put("y", y);
		map.put("z", (x / y));
		return "Calculator1.jsp";
	}

}
