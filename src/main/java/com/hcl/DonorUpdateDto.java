package com.hcl;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class DonorUpdateDto {
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private int id;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private int donor_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

}
