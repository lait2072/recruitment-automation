package com.team13.recruitmentautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class RecruitmentAutomationApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(RecruitmentAutomationApplication.class, args);
//		ArrayList<String> listNumber = new ArrayList();
//		listNumber.add("+79253367293");
//		listNumber.add("+79653105170");
//		listNumber.forEach(number -> {
//			try {
//				WhatsAppSend.sendWhatsUpMessage(number, "какой-то текст");
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		});
	}

}
