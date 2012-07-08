package ph.com.bprompt.datasource.common.dao;

import java.util.List;

import ph.com.bprompt.datasource.common.model.BusinessCode;

public interface BusinessCodeSearchDao {
	
	List<BusinessCode> searchCodeByCodeTypeAndLanguage(String codeType, String language);
}
