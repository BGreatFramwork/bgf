package erp.com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import erp.com.service.COM10000MService;
import lombok.extern.slf4j.Slf4j;

/**
* =====================================================================================
* @packageName    		: erp.com.service.impl
* @fileName       		: COM10000MServiceimpl.java
* @author         		: Built1
* @date           		: 2026.10.15
* @description    		: 코드유형 데이터를 조회/저장하는 구현체 클래스
* =====================================================================================
* 수정일자         		수정자             수정내용
* -------------------------------------------------------------------------------------
* 2026.10.15        	Built1             최초 생성
*/
@Slf4j
@Service
public class COM10000MServiceimpl implements COM10000MService {

	@Resource
	private COM10000MMapper mapper;
	
	/**
	* @methodName     		: selectCodeTypeList
	* @author         		: built1
	* @date           		: 2026.10.15
	* @description    		: 코드유형 데이터를 조회하는 상속메소드
	* @param searchParamMap
	* @param userId
	* @return
	* @throws Exception
	*/
	@Override
	public List<Map<String, Object>> selectCodeTypeList(Map<String, Object> searchParamMap, String userId) throws Exception {
		return mapper.selectCodeTypeList(searchParamMap, userId);
	}

}
