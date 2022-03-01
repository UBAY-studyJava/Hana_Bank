package kr.ac.kopo.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.cash.vo.CashVO;
import kr.ac.kopo.member.vo.MemberVO;

@Repository
public class MemberDAOimpl implements MemberDAO{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public MemberVO login(MemberVO member) {
		MemberVO loginVO = sqlSession.selectOne("member.dao.MemberDAO.login", member);
		return loginVO;
	}

	@Override
	public void join(MemberVO member) {
		sqlSession.insert("member.dao.MemberDAO.join", member);
	}

	@Override
	public String idCheck(String id) {
		String idCheck = sqlSession.selectOne("member.dao.MemberDAO.idCheck", id);
		return idCheck;
	}

	@Override
	public void cashUpdate(CashVO cashVO) {
		sqlSession.update("member.dao.MemberDAO.cashUpdate", cashVO);
	}

	@Override
	public int depositBalanceThisMonth(String id) {
		int depositBalanceThisMonth;
		try {
			depositBalanceThisMonth = sqlSession.selectOne("member.dao.MemberDAO.depositBalanceThisMonth", id);
		}catch (NullPointerException e) {
			depositBalanceThisMonth = 0;
		}
		return depositBalanceThisMonth;
	}

	@Override
	public int savingsBalanceThisMonth(String id) {
		int savingsBalanceThisMonth;
		try {
			savingsBalanceThisMonth = sqlSession.selectOne("member.dao.MemberDAO.savingsBalanceThisMonth", id);
		}catch (NullPointerException e) {
			savingsBalanceThisMonth = 0;
		}
		return savingsBalanceThisMonth;
	}

	@Override
	public int withdralBalanceThisMonth(String id) {
		int withdralBalanceThisMonth;
		try {
			withdralBalanceThisMonth = sqlSession.selectOne("member.dao.MemberDAO.withdralBalanceThisMonth", id);
		}catch (NullPointerException e) {
			withdralBalanceThisMonth = 0;
		}
		return withdralBalanceThisMonth;
	}

	/*
	 * Gets all details of member based on id
	 */
	@Override
	public MemberVO selectMember(String id) {
		MemberVO member = sqlSession.selectOne("member.dao.MemberDAO.selectMember", id);
		return member;
	}

	
}
