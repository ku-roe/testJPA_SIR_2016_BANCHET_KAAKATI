package services;

import java.util.Collection;
import java.util.List;

import domain.*;

public interface ResidenceService {

	void addResidence(int nbPiece, int size);

	void removeResidence(int id);

	Collection<Residence> getResidence();

	Collection<Residence> getResidence(int id);

}
