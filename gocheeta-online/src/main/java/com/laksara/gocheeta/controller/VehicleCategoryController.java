package com.laksara.gocheeta.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.laksara.gocheeta.model.VehicleCategory;
import com.laksara.gocheeta.service.VehicleCategoryService;

public class VehicleCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VehicleCategoryService vehicleCategoryService;
	String errormsg;
	String deletemsg;

	public VehicleCategoryController() {
		vehicleCategoryService = VehicleCategoryService.getVehicleCategoryService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String categoryID = request.getParameter("vcid");
		if (categoryID != null) {
			launchSpecificVehicleCategory(request, response);
		} else {
			launchAllVehicleCategories(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");
		
		if(type != null) {
			if(type.equals("update")) {
				updateVehicleCategory(request, response);
			}else if(type.equals("add")) {
				insertVehicleCategory(request, response);
			}else if(type.equals("delete")) {
				deleteVehicleCategory(request,response);
			}
		}

	}

	private void launchSpecificVehicleCategory(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		clearMessage();
		
		String categoryID = request.getParameter("vcid");
		VehicleCategory vehicleCategory = new VehicleCategory();
		
		
			try {
				vehicleCategory = vehicleCategoryService.getVehicleCategory(categoryID);
			} catch (ClassNotFoundException | SQLException e) {
				errormsg = e.getMessage();
			}
		
		HttpSession session = request.getSession();
		session.setAttribute("errormsg", errormsg);
		session.setAttribute("vehicleCategory", vehicleCategory);
		
		
		response.sendRedirect("gocheeta-managevehiclecategories.jsp");

	}

	private void launchAllVehicleCategories(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<VehicleCategory> vehicleCategoryList;

		clearMessage();

		try {
			vehicleCategoryList = vehicleCategoryService.getVehicleCategories();
		} catch (ClassNotFoundException | SQLException e) {
			errormsg = e.getMessage();
			vehicleCategoryList = new ArrayList<VehicleCategory>();
		}

		request.setAttribute("vehicleCategoryList", vehicleCategoryList);
		request.setAttribute("errormsg", errormsg);

		RequestDispatcher rd = request.getRequestDispatcher("gocheeta-vehiclecategories.jsp");
		rd.forward(request, response);
	}

	private void updateVehicleCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categoryID = request.getParameter("vcid");
		String categoryName = request.getParameter("categoryName");
		clearMessage();
		
		VehicleCategory vehicleCategory = new VehicleCategory(categoryID,categoryName);
		try {
			boolean result = vehicleCategoryService.updateVehicleCategory(vehicleCategory);
			if(result) {
				errormsg = "The Vehicle Category has been updated successfully! Vehicle Category ID : " + vehicleCategory.getCategoryID(); 
			}else {
				errormsg = "Failed to update";
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			errormsg = e.getMessage();
		}
		
		request.setAttribute("message", errormsg);
		request.setAttribute("vehicleCategory", vehicleCategory);
		RequestDispatcher rd = request.getRequestDispatcher("gocheeta-managevehiclecategories.jsp");
		rd.forward(request, response);
		
		
	}
	
	private void insertVehicleCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		clearMessage();
		
		String categoryID = request.getParameter("vcid");
		String categoryName = request.getParameter("categoryName");
		
		VehicleCategory vehicleCategory = new VehicleCategory(categoryID,categoryName);
		
		try {
			boolean result = vehicleCategoryService.addVehicleCategory(vehicleCategory);
			if(result) {
				errormsg = "Vehicle Category Added Successfully! Vehicle Category ID " + categoryID;
			}
			else {
				errormsg = "Failed to added Vehicle Category";
			}
		} catch (ClassNotFoundException | SQLException e) {
			errormsg = e.getMessage();
		}
		request.setAttribute("message", errormsg);
		RequestDispatcher rd = request.getRequestDispatcher("gocheeta-addvehiclecategory.jsp");
		rd.forward(request, response);
		
		
	}
	
	private void deleteVehicleCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categoryID = request.getParameter("categoryID");
		clearMessage();
		
		try {
			boolean result = vehicleCategoryService.deleteVehicleCategory(categoryID);
			if(result) {
				deletemsg = "The Vehicle Category with Category ID: " + categoryID + " has been deleted successfully!";
			}else {
				deletemsg = "Failed to delete Vehicle Category with Category ID: " + categoryID;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			deletemsg = e.getMessage();
		}
		request.setAttribute("deletemessage", deletemsg);
		launchAllVehicleCategories(request, response);
		
		
	}
	
	private void clearMessage() {
		errormsg = "";
	}

}
