package erp.erpProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.erpProject.model.MemberVO;
import erp.erpProject.service.MemberService;

@Controller
@RequestMapping("/sign/*")
public class SignController {
	private static final Logger log = LoggerFactory.getLogger(SignController.class);
	
	@Autowired
	private MemberService mem;
	
	@GetMapping("join")
		public String join() {
			return "/sign/join";
		}
	
	@GetMapping("jusoPopup")
		public String jusoPopup() {
			return "/sign/jusoPopup";
		}

	@PostMapping("jusoPopup")
		public String jusoPopup1() {
			return "/sign/jusoPopup";
		}
	
	@PostMapping("memberInsert")
	public String memberInsert(MemberVO memVO) {
		mem.memInsert(memVO);
		return "redirect:/";
	}

}
