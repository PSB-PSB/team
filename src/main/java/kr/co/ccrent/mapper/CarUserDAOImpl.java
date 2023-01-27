package kr.co.ccrent.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.ccrent.dto.CarUserDTO;
import kr.co.ccrent.dto.Criteria;

public class CarUserDAOImpl implements CarUserDAO {
	
	@Autowired
	SqlSession sql;
	
	@Override
	public String selectTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CarUserDTO carUserDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

//	회원 로그인
	@Override
	public CarUserDTO login(CarUserDTO carUserDTO) throws Exception{
		// TODO Auto-generated method stub
		return sql.selectOne("UserMapper.login",carUserDTO);
	}

//	회원정보 리스트
	@Override
	public List<CarUserDTO> select() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList("UserMapper.list");
	}

//	회원정보 상세보기
	@Override
	public CarUserDTO detail(int car_uno) {
		// TODO Auto-generated method stub
		return sql.selectOne("UserMapper.detail",car_uno);
	}

//	회원탈퇴
	@Override
	public int delete(int car_uno) {
		// TODO Auto-generated method stub
		return sql.update("UserMapper.delete", car_uno);
	}

	@Override
	public int listPage_count(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CarUserDTO> listPage(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int user_se_count(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CarUserDTO> user_se(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

//	페이징처리 개시물 총 갯수




	




}