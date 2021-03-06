package erp.erpProject.service;

import java.util.List;

import erp.erpProject.model.Criteria;
import erp.erpProject.model.NoticeVO;

public interface BoardService {
	
	public List<NoticeVO> NoticeList(Criteria cri);
	
	public NoticeVO getNotice(long bno);
	
	public boolean createdNotice(NoticeVO vo);
	
	public boolean updateNotice(NoticeVO vo);
	
	public boolean delNotice(long bno);
	
	public int getTotalCount(Criteria cri);
	
}
