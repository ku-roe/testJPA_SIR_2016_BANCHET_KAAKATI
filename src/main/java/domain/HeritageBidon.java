package domain;

import javax.persistence.*;

@Entity
public class HeritageBidon extends ElectronicDevice {

	private int size;

	public HeritageBidon(int id, String name, String nbWatt, int size) {
		super(id, name, nbWatt);
		// TODO Auto-generated constructor stub
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
