package com.rankings.service;

import com.rankings.domain.NoticeVO;

import java.util.List;

public interface NoticeService {
    public List<NoticeVO> getNoticeList();
    public int postNotice(NoticeVO vo);
    public int updateNotice(NoticeVO vo);
    public int deleteNotice(Long notice_id);
}
