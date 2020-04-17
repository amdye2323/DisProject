package erp.erpProject.model;

import java.sql.Date;

import lombok.Data;

@Data
public class ClientVO {

	private Long cnum,emp_num;
	private String cname,cfield,scale,price;
	private Date regdate;
}
