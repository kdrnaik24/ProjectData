package com.qm.Populator;

import org.springframework.stereotype.Component;

import com.qm.dto.TestScriptDto;
import com.qm.model.TestScriptModel;

@Component
public class TestScriptPopulator
{
	
	
	public void populator(TestScriptDto testscriptdto,TestScriptModel testscriptmodel)
	{
		testscriptdto.setDataset(testscriptmodel.getDataset());
		testscriptdto.setExecutionInstruction(testscriptmodel.getExecutionInstruction());
		testscriptdto.setScriptTitle(testscriptmodel.getScriptTitle());
		testscriptdto.setTestScriptId(testscriptmodel.getTestScriptId());
	}
	
	
	public void populator(TestScriptModel testscriptmodel,TestScriptDto testscriptdto)
	{
		testscriptmodel.setDataset(testscriptdto.getDataset());
		testscriptmodel.setExecutionInstruction(testscriptdto.getExecutionInstruction());
		testscriptmodel.setScriptTitle(testscriptdto.getScriptTitle());
		testscriptmodel.setTestScriptId(testscriptdto.getTestScriptId());
	}

}
