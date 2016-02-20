package services;

import java.util.List;

import domain.*;

public interface ResidenceService {

	void addResidence(int nbPiece, int size);

	void removeResidence(int id);

	List<Residence> getResidence();

	List<Residence> getResidence(int id);

}
