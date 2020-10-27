package com.hcl;

import com.hcl.*;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;

public class RequestsDao {

	public ArrayList<BloodRequests> getMyRequests(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BloodRequest WHERE contact_id = " + id + " ORDER BY id");
			ArrayList<BloodRequests> requests = new ArrayList<BloodRequests>();
			while (rs.next()) {
				BloodRequests r = new BloodRequests(rs.getInt("id"), rs.getInt("contact_id"), rs.getInt("patient_id"),
						rs.getString("patient_name"), rs.getString("blood_group"), rs.getString("city"),
						rs.getString("hospital_name"), rs.getString("contact_name"), rs.getString("contact_number"),
						rs.getInt("donor_id"), rs.getString("status"));
				requests.add(r);
			}
			st.close();
			return requests;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public ArrayList<BloodRequests> getMyDonations(int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BloodRequest WHERE donor_id = " + id + " ORDER BY id");
			ArrayList<BloodRequests> requests = new ArrayList<BloodRequests>();
			while (rs.next()) {
				BloodRequests r = new BloodRequests(rs.getInt("id"), rs.getInt("contact_id"), rs.getInt("patient_id"),
						rs.getString("patient_name"), rs.getString("blood_group"), rs.getString("city"),
						rs.getString("hospital_name"), rs.getString("contact_name"), rs.getString("contact_number"),
						rs.getInt("donor_id"), rs.getString("status"));
				requests.add(r);
			}
			st.close();
			return requests;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public Boolean Donate(int requestId, int donorId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			String updateSql = "UPDATE BloodRequest SET status = 'Pending', donor_id = " + donorId + " WHERE id = "
					+ requestId;
			st.executeUpdate(updateSql);
			st.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public Boolean MakeRequest(NewRequestDto r) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			String addRequestSql = "INSERT INTO BloodRequest\n"
					+ "(contact_id, patient_id, patient_name, blood_group,\n"
					+ "city, hospital_name, contact_name, contact_number, donor_id, status)\n" + "VALUES('"
					+ r.getContact_id() + "','" + r.getPatient_id() + "','" + r.getPatient_name() + "','"
					+ r.getBlood_group() + "','" + r.getCity() + "','" + r.getHospital_name() + "','"
					+ r.getContact_name() + "','" + r.getContact_number() + "', 0, 'Requested')";

			st.executeUpdate(addRequestSql);
			st.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public ArrayList<BloodRequests> getPendingRequests() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BloodRequest WHERE status = 'Pending' ORDER BY id");
			ArrayList<BloodRequests> requests = new ArrayList<BloodRequests>();
			while (rs.next()) {
				BloodRequests r = new BloodRequests(rs.getInt("id"), rs.getInt("contact_id"), rs.getInt("patient_id"),
						rs.getString("patient_name"), rs.getString("blood_group"), rs.getString("city"),
						rs.getString("hospital_name"), rs.getString("contact_name"), rs.getString("contact_number"),
						rs.getInt("donor_id"), rs.getString("status"));
				requests.add(r);
			}
			st.close();
			return requests;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public ArrayList<BloodRequests> getRequests() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM BloodRequest WHERE status = 'Requested' ORDER BY id");
			ArrayList<BloodRequests> requests = new ArrayList<BloodRequests>();
			while (rs.next()) {
				BloodRequests r = new BloodRequests(rs.getInt("id"), rs.getInt("contact_id"), rs.getInt("patient_id"),
						rs.getString("patient_name"), rs.getString("blood_group"), rs.getString("city"),
						rs.getString("hospital_name"), rs.getString("contact_name"), rs.getString("contact_number"),
						rs.getInt("donor_id"), rs.getString("status"));
				requests.add(r);
			}
			st.close();
			return requests;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public Boolean approve(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			String updateSql = "UPDATE BloodRequest SET status = 'Approved' WHERE id = " + id;
			st.executeUpdate(updateSql);
			st.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public Boolean reject(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "lakshmi21");
			Statement st = con.createStatement();
			String updateSql = "UPDATE BloodRequest SET status = 'Requested', donor_id = 0 WHERE id = " + id;
			st.executeUpdate(updateSql);
			st.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}