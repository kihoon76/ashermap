package ch.asher.dao;

import java.util.List;
import java.util.Map;

import ch.asher.domain.Address;

public interface HotplaceDao {

	public List<String> selectListGuGun(String si);

	public List<String> selectListRegionName(Address addr);

	public List<String> selectListAddress(Address address);

	public List<String> selectListLocationBounds(Map<String, String> param);

	public List<String> selectListGongsiBounds(Map<String, String> param);
}
