package com.tls.liferaylms.test.unit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.tls.liferaylms.report.BeanReportContext;
import com.tls.liferaylms.test.SeleniumTestCase;
import com.tls.liferaylms.test.util.Context;
import com.tls.liferaylms.test.util.GetPage;
import com.tls.liferaylms.test.util.Login;
import com.tls.liferaylms.test.util.Sleep;
import com.tls.liferaylms.test.util.TestProperties;

/**
 * @author Diego Renedo Delgado
 */
public class Ab_CreateUsers extends SeleniumTestCase {
	
	@Test
	public void testCreateUsers() throws Exception {
		if(getLog().isInfoEnabled())getLog().info("init");
		try{
			Login login = new Login(driver, Context.getUser(), Context.getPass(), Context.getBaseUrl());
			boolean loged = login.isLogin();
			assertTrue("Error not logued"+getLineNumber(),loged);
			if (loged) {
				validateUser(Context.getStudentUser(), Context.getStudentName(), Context.getStudentPass());
				validateUser(Context.getStudentUser2(), Context.getStudentName2(), Context.getStudentPass2());
				validateUser(Context.getTeacherUser(), Context.getTeacherName(), Context.getTeacherPass());
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void validateUser(String email,String name,String pass){
		GetPage.getPage(driver, Context.getBaseUrl(), "/group/control_panel");
		
		WebElement users = getElement(By.id("_160_portlet_125"));
		assertNotNull("Not Menu users"+getLineNumber(), users);
		users.click();

		//Sleep.sleep(2000);
		Sleep.waitForLoad(driver);
		WebElement usersText = getElement(By.id("_125_keywords"));
		assertNotNull("Not usersText"+getLineNumber(), usersText);
		
		usersText.sendKeys(email);
		usersText.sendKeys(Keys.RETURN);
		
//		Sleep.sleep(2000);
		Sleep.waitForLoad(driver);

		if(getLog().isInfoEnabled())getLog().info("Check users...");
		WebElement search = getElement(By.id("usersAdminUsersPanel"));
		assertNotNull("Not search results"+getLineNumber(), search);
		
		List<WebElement> tres = getElements(search, By.tagName("tr"));
		
		if(getLog().isInfoEnabled())getLog().info("Size:"+tres.size());
		if(tres.size()<=3){
			WebElement msgInfo = getElement(search,By.className("portlet-msg-info"));
			if(msgInfo!=null){
				if(getLog().isInfoEnabled())getLog().info("Creating user...");
				createUser(email, name, pass);
			}
		}
	}
	
	private void createUser(String email,String name,String pass){
		WebElement addUsersA =  getElement(By.id("_125_kldx_menu_user"));
		assertNotNull("Not menu add user"+getLineNumber(), addUsersA);
		  
		String location = addUsersA.getAttribute("href");
		
		GetPage.getPage(driver, "", location);
		
		WebElement sn = getElement(By.id("_125_screenName"));
		assertNotNull("Not sn for add user"+getLineNumber(), sn);
		String[] names = email.split("@");
		if(names.length>0){
			sn.sendKeys(names[0]);
		}
		WebElement ea = getElement(By.id("_125_emailAddress"));
		assertNotNull("Not emailAddress for add user"+getLineNumber(), ea);
		ea.sendKeys(email);
		
		WebElement ln = getElement(By.id("_125_lastName"));
		assertNotNull("Not lastName for add user"+getLineNumber(), ln);
		ln.sendKeys(name);

		WebElement fn = getElement(By.id("_125_firstName"));
		assertNotNull("Not firstName for add user"+getLineNumber(), fn);
		fn.sendKeys(name);
		
		WebElement input = getElement(By.className("aui-button-input-submit"));
		assertNotNull("Not input for add user"+getLineNumber(), input);
		input.click();
		
//		Sleep.sleep(4000);
		Sleep.waitForLoad(driver);

		WebElement pl = getElement(By.id("_125_passwordLink"));
		assertNotNull("Not passwordLink for add user"+getLineNumber(), pl);
		pl.click();

		WebElement p1 = getElement(By.id("_125_password1"));
		assertNotNull("Not passwordText1 for add user"+getLineNumber(), p1);
		p1.sendKeys(pass);
		
		WebElement p2 = getElement(By.id("_125_password2"));
		assertNotNull("Not passwordText2 for add user"+getLineNumber(), p2);
		p2.sendKeys(pass);
		
		input = getElement(By.className("aui-button-input-submit"));
		assertNotNull("Not input for add user"+getLineNumber(), input);
		input.click();
		
		//Rellenamos para el informe
		if 		(name == TestProperties.get("student-name")){
			BeanReportContext.setCreateStudent(true);
		}else if(name == TestProperties.get("student2-name")){
			BeanReportContext.setCreateStudent2(true);
		}else if(name == TestProperties.get("teacher-name")){
			BeanReportContext.setCreateTeacher(true);
		}
	}
}
