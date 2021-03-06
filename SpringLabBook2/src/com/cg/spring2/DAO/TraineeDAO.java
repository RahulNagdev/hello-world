package com.cg.spring2.DAO;

import java.util.List;

import com.cg.spring2.dto.TraineeDTO;

public interface TraineeDAO {
	
	public void addTrainee(TraineeDTO tainee);
	public void deleteTrainee(int id);
	public void modifyTrainee(int id);
	public TraineeDTO retrieveTrainee(int id);
	public List<TraineeDTO> retrieveAll();

}
