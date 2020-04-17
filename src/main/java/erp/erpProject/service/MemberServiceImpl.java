package erp.erpProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import erp.erpProject.mapper.MemberMapper;
import erp.erpProject.model.Criteria;
import erp.erpProject.model.MemberVO;
import lombok.Setter;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper mapper;
	@Setter(onMethod_ = @Autowired)
	private PasswordEncoder pwencoder;
	
	@Transactional
	@Override
	public void memInsert(MemberVO memVO) {
		// TODO Auto-generated method stub
		String memPW = memVO.getEmp_pass();
		memVO.setEmp_pass(pwencoder.encode(memPW));
		System.out.println(memVO.getEmp_name());
		mapper.memInsert(memVO);
	}

	@Override
	public void memDel(int emp_num) {
		// TODO Auto-generated method stub
		mapper.memDel(emp_num);
	}

	@Override
	public void memModify(MemberVO memVO) {
		// TODO Auto-generated method stub
		mapper.memModify(memVO);
	}

	@Override
	public List<MemberVO> memList() {
		// TODO Auto-generated method stub
		return mapper.memList();
	}

	@Override
	public void memGet(String emp_id) {
		// TODO Auto-generated method stub
		mapper.memGet(emp_id);
	}



}
