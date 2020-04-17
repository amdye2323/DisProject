package erp.erpProject.mapper;

import java.util.List;

import erp.erpProject.model.ClientVO;

public interface ClientMapper {

public int insert();
	
	public List<ClientVO> list();
	
	public ClientVO get();
	
	public void update(ClientVO vo);
	
	public void delete(Long cnum);
	
	public int getTotal();
}
