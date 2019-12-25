package com.rankings.controller;

import com.rankings.domain.NoticeVO;
import com.rankings.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j
@RestController
@Api(value = "swag-rest-controller", description = "공지사항 CRUD API ")
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @ApiOperation(value="공지사항 리스트 API", notes="공지사항 전체 목록을 가져오는 API")
    @GetMapping(produces = "application/json; charset=UTF-8")
    public List<NoticeVO> getNoticeList() {
        List<NoticeVO> list = noticeService.getNoticeList();
        log.debug("NoticeController : getNoticeList size "+list.size());
        return noticeService.getNoticeList();
    }

    @ApiOperation(value="공지사항 등록 API", notes="공지사항을 등록하는 API")
    @PostMapping(produces = "application/json; charset=UTF-8")
    public String postNotice(NoticeVO vo) {
        String message = "fail";
        log.debug("NoticeController : postNotice NoticeV0 "+vo);
        int re = noticeService.postNotice(vo);
        if (re > 0) {
            message = "success";
        }
        return message;
    }

    @ApiOperation(value="공지사항 수정 API", notes="특정 공지사항 수정하는 API")
    @PutMapping(produces = "application/json; charset=UTF-8")
    public String updateNotice(NoticeVO vo) {
        String message = "수정 실패";
        log.debug("NoticeController : updateNotice NoticeV0 "+vo);
        int re = noticeService.updateNotice(vo);
        if (re > 0) {
            message = "수정 성공";
        }
        return message;
    }

    @ApiOperation(value="공지사항 삭제 API", notes="특정 공지사항 삭제하는 API")
    @DeleteMapping(produces = "application/json; charset=UTF-8")
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
