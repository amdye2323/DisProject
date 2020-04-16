package erp.erpProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import erp.erpProject.mapper.MemberMapper;
import erp.erpProject.model.MemberVO;
import lombok.Setter;

public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper mapper;
	@Setter(onMethod_ = @Autowired)
	private PasswordEncoder pwencoder;

	@Override
	public void memInsert(MemberVO memVO, String grade) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void memDel(MemberVO memVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memModify(MemberVO memVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberVO> memList(MemberVO memVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
