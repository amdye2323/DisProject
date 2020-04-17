package erp.erpProject.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import erp.erpProject.model.AuthVO;
import erp.erpProject.model.Criteria;
import erp.erpProject.model.MemberVO;


public interface MemberMapper {
	//memInsert
	public void memInsert(MemberVO memVO);
	
	//memDel
	public void memDel(int emp_num);
	
	//memModify
	public void memModify(MemberVO memVO);
	
	//memList
	public List<MemberVO> memList();
	
	//상세보기	
	public MemberVO memGet(String emp_id);
}
