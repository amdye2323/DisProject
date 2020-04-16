package erp.erpProject.service;

import java.util.List;

import erp.erpProject.model.MemberVO;

public interface MemberService {
	
	//사원추가
	public void memInsert(MemberVO memVO, String grade);
	
	//사원삭제
	public void memDel(MemberVO memVO);
	
	//사원정보수정
	public void memModify(MemberVO memVO);
	
	//사원list
	public List<MemberVO> memList(MemberVO memVO);
	
}
