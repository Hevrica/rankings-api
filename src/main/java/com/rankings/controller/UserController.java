package com.rankings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rankings.domain.UserVO;
import com.rankings.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/user/*")
@Api(value = "swag-rest-controller", description = "유저 CRUD API")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "유저 등록 API", notes = "유저 등록하는 API")
	@PostMapping(value = "/new", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> insert(@RequestBody UserVO userVO) throws Exception {
		log.info("userVO : " + userVO);

		boolean insert = userService.insert(userVO);
		log.info("insert boolean : " + insert);

		return insert == true ? new ResponseEntity<>("insert Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ApiOperation(value = "유저 정보 API", notes = "특정 유저의 정보를 읽어오는 API")
	@GetMapping(value = "/get/{id}", produces = "application/json; charset=UTF-8")
	public ResponseEntity<UserVO> get(@PathVariable("id") int id) throws Exception {
		log.info("get : " + id);
		return new ResponseEntity<>(userService.get(id), HttpStatus.OK);
	}

	@ApiOperation(value = "유저 수정 API", notes = "특정 유저를 수정하는 API")
	@PutMapping(value = "/modify/{id}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<String> modify(@PathVariable("id") int id, @RequestBody UserVO userVO) throws Exception {
		userVO.setId(id);
		log.info("id : " + id);
		log.info("modify : " + userVO);
		return userService.modify(userVO) == true ? new ResponseEntity<>("modify Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ApiOperation(value = "유저 삭제 API", notes = "특정 유저를 삭제하는 API")
	@DeleteMapping(value = "/remove/{id}", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> remove(@PathVariable("id") int id) throws Exception {
		log.info("remove : " + id);
		return userService.remove(id) == true ? new ResponseEntity<>("remove Success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}