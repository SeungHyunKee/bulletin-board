package com.hello.forum.member.service;

import com.hello.forum.member.vo.MemberVO;

// 회원가입 업무로직 작성을 위한 인터페이스
public interface MemberService {

	/**
	 * 회원가입을 처리한다
	 * @param memberVO 사용자가 작성한 사용자 정보
	 * @return 회원가입이 정상적으로 처리되었는지 여부
	 */
	public boolean createNewMember(MemberVO memberVO);

	
	/**
	 * 사용자가 입력한 이메일이 사용가능한 이메일인지 확인한다.
	 * @param email 사용자가 입력한 이메일
	 * @return 사용가능한 이메일이라면 true, 사용불가능한 이메일이라면 false
	 */
	public boolean checkAvailableEmail(String email);


	/**
	 * 로그인 할 때, 사용되는 메소드
	 * 아이디와 비밀번호가 일치하는 회원정보를 조회한다.
	 * @param memberVO 아이디와 비밀번호가 할당되어있는 객체
	 * @return 회원정보
	 */
	public MemberVO getMember(MemberVO memberVO);


	public boolean deleteMe(String email);


}