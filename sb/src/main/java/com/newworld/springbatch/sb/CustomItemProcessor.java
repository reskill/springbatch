package com.newworld.springbatch.sb;

import org.springframework.batch.item.ItemProcessor;

import com.newworld.springbatch.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	public Report process(Report item) throws Exception {
		System.out.println("Processing.....");
		return item;
	}

	

}
