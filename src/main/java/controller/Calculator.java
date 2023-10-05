package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Calculator {

	@RequestMapping("add")
	String add(HttpServletRequest request, HttpServletResponse response,ModelMap map) throws IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int sum = num1 + num2;
		map.put("num1", num1);
		map.put("num2", num2);
		map.put("res", sum);		
		map.put("action", "Sum");
		return "Result.jsp";
	
	}

	@PostMapping("sub")
	String sub(@RequestParam int num1, @RequestParam int num2,ModelMap map) {
		int dif = num1 - num2;
		map.put("num1", num1);
		map.put("num2", num2);
		map.put("res", dif);		
		map.put("action", "Difference");
		return "Result.jsp";
		}

	@PostMapping("mul")
	String mul(@RequestParam int num1, @RequestParam int num2,ModelMap map) {
		int mul = num1 * num2;
		map.put("num1", num1);
		map.put("num2", num2);
		map.put("res", mul);		
		map.put("action", "Product");
		return "Result.jsp";
	}

	@PostMapping("div")
	String div(@RequestParam int num1, @RequestParam double num2,ModelMap map) {
		double res = num1 / num2;
		map.put("num1", num1);
		map.put("num2", num2);
		map.put("res", res);
		map.put("action", "Division");
		return "Result.jsp";
	}

}
