package erp.erpProject.mapper;

import org.apache.ibatis.annotations.Param;

import erp.erpProject.model.AuthVO;
import erp.erpProject.model.MemberVO;


public interface MemberMapper {
	//memInsert
	public void memInsert(MemberVO memVO);
	
	//memDel
	public void memDel(MemberVO memVO);
	
	//memModify
	public void memModify(MemberVO memVO);
	
	//memList
	public MemberVO memList(String userid);
	
	
	
	
	
}
