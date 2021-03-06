package org.project.security;

import org.project.security.model.CustomUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import erp.erpProject.mapper.MemberMapper;
import erp.erpProject.model.MemberVO;
import lombok.Setter;


public class CustomUserDetailsService implements UserDetailsService {
	private static final Logger log = LoggerFactory.getLogger(CustomUserDetailsService.class);

	@Setter(onMethod_= {@Autowired})
	private MemberMapper memberMapper;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		log.warn("Load User By UserName : " + userName);
		// userName means userid
		MemberVO vo = memberMapper.memGet(userName);
		log.warn("queried by member mapper : " + vo);
		return vo == null ? null : new CustomUser(vo);
	}
}
