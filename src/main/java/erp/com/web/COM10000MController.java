package erp.com.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nexacro.uiadapter.spring.core.annotation.ParamDataSet;
import com.nexacro.uiadapter.spring.core.annotation.ParamVariable;
import com.nexacro.uiadapter.spring.core.data.NexacroResult;

import erp.com.service.COM10000MService;
import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

/**
* =====================================================================================
* @packageName    		: erp.com.web
* @fileName       		: COM10000MController.java
* @author         		: Built1
* @date           		: 2026.10.15
* @description    		: 코드유형 및 코드 데이터를 조회/저장하는 클래스
* =====================================================================================
* 수정일자         		수정자             수정내용
* -------------------------------------------------------------------------------------
* 2026.10.15        	Built1             최초 생성
*/	
@Slf4j
@Controller
@RequestMapping(value = "com/COM10000M")
public class COM10000MController {

	@Resource
	private COM10000MService service;
	
	/**
	* @methodName     		: selectCodeList
	* @author         		: built1
	* @date           		: 2026.10.15
	* @description    		: 코드유형 데이터를 조회하는 메소드
	* @param searchParamMap
	* @return
	 * @throws Exception 
	*/
    @RequestMapping(value = "selectCodeList.do")
	public NexacroResult selectCodeList(@ParamDataSet(name = "inSearch") Map<String, Object> searchParamMap
			                           ,@ParamVariable(name = "userId") String userId) throws Exception {
		
		Log.debug("매개변수(searchParamMap) 				: " , searchParamMap);
		Log.debug("매개변수(searchParamMap.CODE_TYPE) 		: " , searchParamMap.get("CODE_TYPE"));
		Log.debug("매개변수(searchParamMap.CODE_TYPE_NM) 	: " , searchParamMap.get("CODE_TYPE_NM"));
		Log.debug("매개변수(userId) 						: " , userId);
		
		//자바 형식 데이터를 넥사크로 데이터셋 형식으로 전환
		NexacroResult result = new NexacroResult();
		
		//코드유형 데이터 조회
		List<Map<String, Object>> outSelectCodeTypeList = service.selectCodeTypeList(searchParamMap, userId);
		
		//조회된 데이터셋 결과 추가
		result.addDataSet("outSelectCodeTypeList", outSelectCodeTypeList);
		
		//조회결과 리턴
		return result;
		
	}
}
