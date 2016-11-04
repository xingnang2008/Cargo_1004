package com.cargo.action;

import java.io.ByteArrayInputStream;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.cargo.model.Receipt;
@Component
public class ReceiptAction extends BaseAction<Receipt> {
	private String waybills;
	private Date receiptDate;
	
	public void save(){
		this.receiptService.save(model);
	}
	public void update(){
		this.receiptService.update(model);
	}
	public String deleteByIds(){
		this.receiptService.deleteByIds(ids,waybills);
		inputStream = new ByteArrayInputStream("true".getBytes());		
		return "stream";
	}
	public String find(){		
		pageMap=this.receiptService.find(model.getCustId(), model.getBitch(), model.getWaybill(), model.getSender(), model.getRater(),model.getLineId(), stdate, enddate);
		return "jsonMap";
	}
	public String findByCustAndMethod(){
		pageMap=this.receiptService.findByCustAndMethod(model.getCustName(),model.getSender(), model.getCustId(), model.getPayMethod(), stdate, enddate);
		
		return "jsonMap";
		
	}
	public String updateWaybillsReceipt(){
		
		System.out.println(receiptDate);//输出语句
		this.receiptService.updateWaybillsReceipt(waybills, receiptDate);
		inputStream = new ByteArrayInputStream("true".getBytes());		
		return "stream";
	}
	
	public String getWaybills() {
		return waybills;
	}
	public void setWaybills(String waybills) {
		this.waybills = waybills;
	}
	public Date getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}
	
	
	

	public String inputFromExcel(){
		try {
			String returnMarks= this.receiptService.checkExcel(excelFile, excelFileFileName);
			if(returnMarks == ""){
				returnMarks  =this.receiptService.saveInputExcel(excelFile, excelFileFileName);
				if(returnMarks==""){
					return SUCCESS;
				}else {
					addActionError("数据导入时有问题出现：\n\r");
					addActionError(returnMarks);
				}
			}else {
				addActionError("数据未通过导入前的检查：\n\r");
				addActionError(returnMarks);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return "ERROR";
	}
	
	
}
