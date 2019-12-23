package com.rankings.controller;

import com.rankings.domain.NoticeVO;
import com.rankings.service.NoticeService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j
@RestController
@Api(value = "swag-rest-controller", description = "grank")
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping
    public List<NoticeVO> getNoticeList() {
        List<NoticeVO> list = noticeService.getNoticeList();
        log.debug("NoticeController : getNoticeList size "+list.size());
        return noticeService.getNoticeList();
    }

    @PostMapping
    public String postNotice(NoticeVO vo) {
        String message = "등록 실패";
        log.debug("NoticeController : postNotice NoticeV0 "+vo);
        int re = noticeService.postNotice(vo);
        if (re > 0) {
            message = "등록 성공";
        }
        return message;
    }

    @PutMapping
    public String updateNotice(NoticeVO vo) {
        String message = "수정 실패";
        log.debug("NoticeController : updateNotice NoticeV0 "+vo);
        int re = noticeService.updateNotice(vo);
        if (re > 0) {
            message = "수정 성공";
        }
        return message;
    }

    @DeleteMapping
    public String deleteNotice(Long notice_id) {
        String message = "삭제 실패";
        log.debug("NoticeController : deleteNotice Notice_id "+ notice_id);
        int re = noticeService.deleteNotice(notice_id);
        if (re > 0) {
            message = "삭제 성공";
        }
        return message;
    }
}
