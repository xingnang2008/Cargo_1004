package com.cargo.service;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cargo.model.Bitch;
import com.cargo.model.Company;
import com.cargo.model.Rebate;
import com.cargo.model.Waybill;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:bean.xml")
public class GenerateTest {
	
	
	@Resource
	public BitchService bitchService;
	
	@Resource
	public WaybillService waybillService;
	@Test //测试spring IOC的开发环境
	public void waybillServiceTest(){
		//Map map= waybillService.findByStatusId("", "", "", "", "", 1, 1, 10);
		//waybillService.listByBitch(bitch)
		waybillService.getOneReportStream(340);
	}
		
	@Test
	public void queryWaybillServiceTest2(){
		System.out.println("1-------");
		
		List<Waybill> list =bitchService.queryWaybillByBitch("B0001");
		for(Waybill w : list){
			System.out.println("W :" + w.getWaybill());
		}
		
		System.out.println("2-------");
	}	
	
	@Resource
	private CompanyService companyService;
	@Test
	public void testCompany(){
		List<Company> list = companyService.isCompanyExist("北京测试用公司");
		
		System.out.println(list.size());
		for(Company c : list){
			System.out.println(c.getCompany());
			System.out.println(c.getCompanyCode());
		}
		
		
	}
	@Resource
	public RebateService rebateService;
	
	@Test //测试spring IOC的开发环境
	public void rebateServiceTest(){
		String ids = "7,35,38,40";
		List<Rebate> list = rebateService.listByIds(ids);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getCompany());
		}
	}
	@Test
	public void bitchTestListBylineId(){
		
		String lineId="Air-石家庄";
		List<Bitch> list = bitchService.queryBitchByLine(lineId);
		System.out.println(list.size());
		for(Bitch b :list ){
			System.out.println("批次： "+b.getBitch());
		}
	}
	
}

