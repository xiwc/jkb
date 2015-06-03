package com.skycloud.jkb.dao;

/**
 * 
 * 
 * @creation 2014年1月15日 下午1:48:39
 * @modification 2014年1月15日 下午1:48:39
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface ISkycloudGroupstypeHostDao {

	Boolean deleteByhostId(String hostId);

	Long updateTypeIdByHostId(String hostId, String typeId);
}
