package erp.erpProject.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/client/*")
public class ClientController {

	
	@GetMapping(value = "/list")
	public String cliList(Model model) {
		model.addAttribute("list",list);
		return "/client/clientList";
	}
}
