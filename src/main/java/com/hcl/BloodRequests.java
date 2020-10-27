package com.hcl;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BloodRequests {
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private int id;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private int contact_id;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private int patient_id;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private String patient_name;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private String city;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private String hospital_name;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private String contact_name;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private String contact_number;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private int donor_id;
	@NotBlank(message = "Cannot be empty")
	@Size(min=15, max=20)
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	private String blood_group;

	public BloodRequests(int id, int contact_id, int patient_id, String patient_name, String blood_group, String city,
			String hospital_name, String contact_name, String contact_number, int donor_id, String status) {
		super();
		this.id = id;
		this.contact_id = contact_id;
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.blood_group = blood_group;
		this.city = city;
		this.hospital_name = hospital_name;
		this.contact_name = contact_name;
		this.contact_number = contact_number;
		this.donor_id = donor_id;
		this.status = status;
	}

}
