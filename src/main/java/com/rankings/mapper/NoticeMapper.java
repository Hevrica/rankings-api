package com.rankings.mapper;

import com.rankings.domain.NoticeVO;

import java.util.List;

public interface NoticeMapper {
    public List<NoticeVO> getNoticeList();
    public int postNotice(NoticeVO vo);
    public int updateNotice(NoticeVO vo);
    public int deleteNotice(Long notice_id);
}
