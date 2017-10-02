package ch.asher.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository("sampleDao")
public class SampleDaoImpl implements SampleDao {

	private final static String namespace = "mappers.mssql.sampleMapper";
	
	@Resource(name = "mySqlSession")
	SqlSession mySqlSession;

	@Override
	public List<String> selectSample(String level) {
		List<String> result = mySqlSession.selectList(namespace + ".selectSample", level);
	
		return result;
	}

	
	
}
