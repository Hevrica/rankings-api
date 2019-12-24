package com.rankings.service;

import com.rankings.domain.NoticeVO;
import com.rankings.mapper.NoticeMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
public class NoticeServiceImpl implements NoticeService {

    @Setter(onMethod_ = @Autowired)
    private NoticeMapper noticeMapper;


    @Override
    public List<NoticeVO> getNoticeList() {
        log.debug("Notice Service : getNoticeList execute");
        return noticeMapper.getNoticeList();
    }

    @Override
    public int postNotice(NoticeVO vo) {
        log.debug("Notice Service : postNotice " + vo);
        return noticeMapper.postNotice(vo);
    }

    @Override
    public int updateNotice(NoticeVO vo) {
        log.debug("Notice Service : updateNotice " + vo);
        return noticeMapper.updateNotice(vo);
    }

    @Override
    public int deleteNotice(Long notice_id) {
        log.debug("Notice Service : deleteNotice " + notice_id);
        return noticeMapper.deleteNotice(notice_id);
    }
}
