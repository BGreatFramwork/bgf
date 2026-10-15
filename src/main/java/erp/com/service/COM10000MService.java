package erp.com.service;

import java.util.List;
import java.util.Map;

/**
* =====================================================================================
* @packageName    		: erp.com.service.impl
* @fileName       		: COM10000MService.java
* @author         		: Built1
* @date           		: 2026.10.15
* @description    		: 코드유형 데이터를 조회/저장하는 인터페이스 클래스
* =====================================================================================
* 수정일자         		수정자             수정내용
* -------------------------------------------------------------------------------------
* 2026.10.15        	Built1             최초 생성
*/
public interface COM10000MService {

	/**
	* @methodName     		: selectCodeTypeList
	* @author         		: built1
	* @date           		: 2026.10.15
	* @description    		: 코드유형 데이터를 조회/저장하는 메소드
	* @param searchParamMap
	* @param userId
	* @return
	* @throws Exception
	*/
	List<Map<String, Object>> selectCodeTypeList(Map<String, Object> searchParamMap, String userId) throws Exception;

}
