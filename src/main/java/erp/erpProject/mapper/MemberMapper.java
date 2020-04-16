package erp.erpProject.mapper;

import org.apache.ibatis.annotations.Param;

import erp.erpProject.model.AuthVO;
import erp.erpProject.model.MemberVO;


public interface MemberMapper {
	public MemberVO read(String userid);
	public void insert(MemberVO mvo);
	public void authInsert(@Param("userid") String userid, @Param("auth") String auth);
	public void mInsert(MemberVO memVO);
	public void authInsert(AuthVO authVO);
}
