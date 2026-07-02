package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Car {
	private String username;
	private String carmodel;
	private String cartype;
	private String carnumber;
	private String servicerequest;
	private String servicestatus;
	private String oldregisternumber;
	Connection con = null;

	public String getOldregisternumber() {
		return oldregisternumber;
	}

	public void setOldregisternumber(String oldregisternumber) {
		this.oldregisternumber = oldregisternumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getServicerequest() {
		return servicerequest;
	}

	public void setServicerequest(String servicerequest) {
		this.servicerequest = servicerequest;
	}

	public String getServicestatus() {
		return servicestatus;
	}

	public void setServicestatus(String servicestatus) {
		this.servicestatus = servicestatus;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public Car(String username, String carmodel, String cartype, String carnumber, String servicerequest,
			String servicestatus) {
		super();
		this.username = username;
		this.carmodel = carmodel;
		this.cartype = cartype;
		this.carnumber = carnumber;
		this.servicerequest = servicerequest;
		this.servicestatus = servicestatus;
	}

	public Car() {
		super();
	}

	@Override
	public String toString() {
		return username+" "+cartype+" "+carmodel+" "+carnumber+" "+servicerequest+" "+servicestatus;
	}

	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int carDetails() {
		try {
			String s = "insert into CarDetails values(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, username);
			pstmt.setString(2, carmodel);
			pstmt.setString(3, cartype);
			pstmt.setString(4, carnumber);
			pstmt.setString(5, "NA");
			pstmt.setString(6, "NA");

			int rows = pstmt.executeUpdate();
			return rows;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int serviceRequest() {
		try {
			String s = "update Cardetails set servicerequest=?,servicestatus=? where username=? and carnumber=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, servicerequest);
			pstmt.setString(2, "pending");
			pstmt.setString(3, username);
			pstmt.setString(4, carnumber);
			int rows = pstmt.executeUpdate();

			return rows;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public String serviceStatus() {
		String s = "select* from Cardetails where carnumber=? and username=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, carnumber);
			pstmt.setString(2, username);
			ResultSet res = pstmt.executeQuery();
			if (res.next()) {
				servicestatus = res.getString(6);
				return servicestatus;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public int editCarDetails() {
		try {
			String s = "update CarDetails SET carmodel=?,cartype=?,carnumber=? where username=? AND carnumber=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, carmodel);
			pstmt.setString(2, cartype);
			pstmt.setString(3, carnumber);
			pstmt.setString(4, username);
			pstmt.setString(5, oldregisternumber);

			int rows = pstmt.executeUpdate();
			return rows;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList<Car> viewCars() {
	try {
		String s="select* from CarDetails";
		PreparedStatement pstmt=con.prepareStatement(s);
		ResultSet res=pstmt.executeQuery();
		ArrayList<Car> carDetails=new ArrayList<>();
		while(res.next()) {
			username=res.getString(1);
			carmodel=res.getString(2);
			cartype=res.getString(3);
			carnumber=res.getString(4);
			servicerequest=res.getString(5);
			servicestatus=res.getString(6);
		 carDetails.add(new Car(username,carmodel,cartype,carnumber,servicerequest,servicestatus));
	}
	   return carDetails;
	   
	}catch(Exception e){
		e.printStackTrace();
	}
	return null;
}

}

