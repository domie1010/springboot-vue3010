package com.yjkj.framework.rbac.company.service.impl;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.company.model.Company;
import com.yjkj.framework.rbac.company.service.inte.CompanyService;
@Service
public class CompanyServiceImpl extends BaseService implements CompanyService {

	
	@Override
	public Pager informationLoad(Pager pager,Company Company,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("company", Company);
		List<Company> list = this.companyDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Company));
		return pager;
	}

	@Override
	public List<Company> informationLoadAll(Company Company) throws Exception {
		List<Company> list = this.companyDao.informationLoadAll(Company);
		return list;
	}
	

	@Override
	public Integer count(Company Company) throws Exception {
		Integer count = this.companyDao.count(Company);
		return count;
	}

	@Override
	public Company informationLoadOne(Company Company) throws Exception {
			Company = this.companyDao.informationLoadOne(Company);
		return Company;
	}

	@Override
	public void informationDelete(Company Company) throws Exception {
			this.companyDao.informationDelete(Company);

	}

	@Override
	public void informationAdd(Company Company) throws Exception {
			Company.setId(Regular.createId());
			Company.setCreatetime(CreatDate.getDate());
			this.companyDao.informationAdd(Company);

	}

	@Override
	public void informationUpade(Company Company) throws Exception {
			this.companyDao.informationUpdate(Company);
	}
	
	@Override
	public void exceptExcel(Company company, HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {
		 response.setContentType("application/vnd.ms-excel");  
		 String  codedFileName = java.net.URLEncoder.encode("合作商信息", "UTF-8");  
	         response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");  
		List<Company> list = this.companyDao.informationLoadAll(company);
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("体检报表信息");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("供应商名称");
		row.createCell(1).setCellValue("供应商地址");
		row.createCell(2).setCellValue("供应商电话");
		row.createCell(3).setCellValue("供应商邮箱");
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
		for (int i = 1; i <= list.size(); i++) {
			Company company1 = list.get(i - 1);
			row = sheet.createRow(i);
			row.createCell(0).setCellValue(company1.getName());
			row.createCell(1).setCellValue(company1.getAddress());
			row.createCell(2).setCellValue(company1.getPhone());
			row.createCell(3).setCellValue(company1.getEmail());
		}
		 OutputStream  fOut = response.getOutputStream();  
        workbook.write(fOut); 
        fOut.flush();  
        fOut.close(); 
		
	}

}
