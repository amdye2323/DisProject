package erp.erpProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import erp.erpProject.mapper.BoardMapper;
import erp.erpProject.model.Criteria;
import erp.erpProject.model.NoticeVO;
import lombok.Setter;

@Service
public class BoardServiceImpl implements BoardService{

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Override
	public List<NoticeVO> NoticeList(Criteria cri) {
		// TODO Auto-generated method stub
		cri.setPageNum((cri.getPageNum()-1)*cri.getAmount());
		return mapper.NoticeList(cri);
	}

	@Override
	public NoticeVO getNotice(long bno) {
		// TODO Auto-generated method stub
		return mapper.getNotice(bno);
	}

	@Override
	public boolean createdNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		return mapper.createdNotice(vo);
	}

	@Override
	public boolean updateNotice(NoticeVO vo) {
		// TODO Auto-generated method stub
		return mapper.updateNotice(vo);
	}

	@Override
	public boolean delNotice(long bno) {
		// TODO Auto-generated method stub
		return mapper.delNotice(bno);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		// TODO Auto-generated method stub
		return mapper.getTotalCount(cri);
	}
	
	
}
