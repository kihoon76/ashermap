package ch.asher.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import ch.asher.domain.Address;

@Repository("hotplaceDao")
public class HotplaceDaoImpl implements HotplaceDao {

	private final static String namespace = "mappers.mssql.hotplaceMapper";
	
	@Resource(name = "mySqlSession")
	SqlSession mySqlSession;
	
	@Override
	public List<String> selectListGuGun(String si) {
		
		return mySqlSession.selectList(namespace + ".selectGuGun", si);
	}

	@Override
	public List<String> selectListRegionName(Address addr) {
		return mySqlSession.selectList(namespace + ".selectRegionName", addr);
	}

	@Override
	public List<String> selectListAddress(Address address) {
		return mySqlSession.selectList(namespace + ".selectAddress", address);
	}

	@Override
	public List<String> selectListLocationBounds(Map<String, String> param) {
		return mySqlSession.selectList(namespace + ".selectLocationBounds", param);
	}

	@Override
	public List<String> selectListGongsiBounds(Map<String, String> param) {
		return mySqlSession.selectList(namespace + ".selectGongsiBounds", param);
	}

}
