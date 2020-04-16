package erp.erpProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import erp.erpProject.model.Criteria;
import erp.erpProject.model.NoticeVO;
import erp.erpProject.model.PageDTO;
import erp.erpProject.service.BoardService;
import lombok.Setter;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
	@GetMapping("notice")
	public String notice(Model model,Criteria cri) {
		int pageCri = cri.getPageNum();
		List<NoticeVO> list =  service.NoticeList(cri);
		cri.setPageNum(pageCri);
		int total = service.getTotalCount(cri);
		model.addAttribute("list",list);
		model.addAttribute("page",new PageDTO(cri, total));
		return "/board/notice";
	}
	
	@PostMapping("register")
	public String register(NoticeVO vo){
		service.createdNotice(vo);
		return "redirect:/board/notice";
	}
	
	@GetMapping("register")
	public void register() {
		
	}
	
	@GetMapping("get")
	public void get(Model model,long bno) {
		NoticeVO vo =  service.getNotice(bno);
		model.addAttribute("board",vo);
	}
	
	
}
