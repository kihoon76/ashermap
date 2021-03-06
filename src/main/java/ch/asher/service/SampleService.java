package ch.asher.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ch.asher.dao.SampleDao;
import ch.asher.dao.SampleDaoImpl;
import ch.asher.utils.DataUtil;

@Service("SampleService")
public class SampleService {

	@Resource(name="sampleDao")
	SampleDao sampleDao;
	
	public String getSample(String level) {
		List<String> list = sampleDao.selectSample(level);
		//return DataUtil.makeLatLng(list, "□");
		return DataUtil.makeLatLngWeight(list, ",");
		//return "[[125.4,37.75],[128.56,35.42],[128.34,35.57],[125.91,33.51],[125.89,33.53],[125.92,33.52]]";
	}
}
