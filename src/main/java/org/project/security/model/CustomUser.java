package org.project.security.model;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import erp.erpProject.model.MemberVO;
import lombok.Getter;

@Getter
public class CustomUser extends User{
   private static final long serialVersionUID = 1L;
   private MemberVO member;

<<<<<<< HEAD
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
	}
	
	public CustomUser(MemberVO vo) 
	{
		super(vo.getUserid(), vo.getUserpw(), vo.getAuthList().stream()
				.map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));
		// TODO Auto-generated constructor stub
		this.member=vo;
	}
=======
   public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
      super(username, password, authorities);
      // TODO Auto-generated constructor stub
   }
   
   public CustomUser(MemberVO vo) 
   {
      super(vo.getEmp_id(), vo.getEmp_pass(), vo.getAuthList().stream()
            .map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));
      // TODO Auto-generated constructor stub
      this.member=vo;
   }
>>>>>>> c08ce0fac828869523bbb5420129db3b65375c4f

}