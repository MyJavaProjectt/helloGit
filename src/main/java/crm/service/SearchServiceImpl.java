package crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import crm.mapper.BaseDictMapperCustom;
import crm.mapper.CustomerMapperCustom;
import crm.po.BaseDict;
import crm.po.Customer;
import crm.po.QueryVo;
@Service
public class SearchServiceImpl {
	
	@Autowired
	private BaseDictMapperCustom baseDictMapperCustom;
	
	@Autowired
	private CustomerMapperCustom customerMapperCustom;
	
	public List<BaseDict> findDictByCodeInService(String code) throws Exception {
		
		return baseDictMapperCustom.findDictByCode(code);
	}
	
	public List<Customer> findCustomerByMsg(QueryVo queryVo) throws Exception{
		
		return customerMapperCustom.findCustomerByMsg(queryVo);
	}
	
	public int findCustomerByVoCount(QueryVo queryVo) throws Exception{
		return customerMapperCustom.findCustomerByVoCount(queryVo);
	}
}
