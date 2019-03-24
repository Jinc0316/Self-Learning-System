package com.sls.service;

import java.util.List;

import com.sls.vo.ExerciseRecord;

public interface ExerciseRecordService {
	/**
	 * 添加刷题记录
	 * @param exerciseRecord
	 * @return int
	 * */
	int insertExerciseRecord(ExerciseRecord exerciseRecord);

	/**
	 * 根据recordUserId获取刷题记录
	 * @param recordId
	 * @return list
	 * */
	List<ExerciseRecord> getExerciseRecordByRecordUserId(String recordUserId);
	
	/**
	 * 根据recordId获取刷题记录
	 * @param recordId
	 * @return list
	 * */
	ExerciseRecord getExerciseRecordByRecordId(int recordId); 
}
