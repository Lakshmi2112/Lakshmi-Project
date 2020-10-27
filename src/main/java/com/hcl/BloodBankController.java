package com.hcl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import com.hcl.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BloodBankController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLandingPage() {
		return "landing";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showHomePage() {
		RequestsDao dao = new RequestsDao();
		ArrayList<BloodRequests> requests = dao.getRequests();
		ModelAndView mv = new ModelAndView("/home");
		mv.addObject("requests", requests);
		return mv;
	}

	@GetMapping("/request")
	public String showRequestPage() {
		return "request";
	}

	@GetMapping("/dashboard")
	public String showDashboardPage() {
		return "dashboard";
	}

	@GetMapping("/admindashboard")
	public String showAdminDashboardPage() {
		return "admindashboard";
	}

	@GetMapping("/donate")
	public String showDonatePage() {
		return "donate";
	}

	@GetMapping("/register")
	public String showRegisterPage() {
		return "registration";
	}

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@GetMapping("/approval")
	public ModelAndView showApprovalPage() {
		RequestsDao dao = new RequestsDao();
		ArrayList<BloodRequests> requests = dao.getPendingRequests();
		ModelAndView mv = new ModelAndView("/approval");
		mv.addObject("requests", requests);
		return mv;
	}

	@GetMapping("/getmyrequests")
	public ModelAndView GetMyRequests(@RequestParam int id) {
		RequestsDao dao = new RequestsDao();
		ArrayList<BloodRequests> requests = dao.getMyRequests(id);
		ModelAndView mv = new ModelAndView("/myrequests");
		mv.addObject("requests", requests);
		return mv;
	}

	@GetMapping("/getmydonations")
	public ModelAndView GetMyDonations(@RequestParam int id) {
		RequestsDao dao = new RequestsDao();
		ArrayList<BloodRequests> donations = dao.getMyDonations(id);
		ModelAndView mv = new ModelAndView("/mydonations");
		mv.addObject("donations", donations);
		return mv;
	}


	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("users") Users user, BindingResult result,
			RedirectAttributes redirectAttributes, Model model) {
		UsersDao dao = new UsersDao();
		if (result.hasErrors()) {
			model.addAttribute("message", "Details must be proper");
			System.out.println("Wronng");
			return "register";
		} else {
			if (dao.Register(user)) {
				return "login";
			} else {
				return "register";
			}
		}
	}

	@PostMapping("/login")
	public ModelAndView login(Users user) {
		UsersDao dao = new UsersDao();
		int id = dao.Login(user);
		if (id > 0) {
			ModelAndView mv;
			if (user.getName().contentEquals("admin"))
				mv = new ModelAndView("/admindashboard");
			else
				mv = new ModelAndView("/dashboard");
			mv.addObject("id", id);
			return mv;
		} else
			return new ModelAndView("/login");
	}

	@PostMapping("/request")
	public String request(NewRequestDto r) {
		RequestsDao dao = new RequestsDao();
		if (dao.MakeRequest(r))
			return "dashboard";
		else
			return "request";
	}

	@PostMapping("/donate")
	public String donate(DonorUpdateDto d) {
		RequestsDao dao = new RequestsDao();
		dao.Donate(d.getId(), d.getDonor_id());
		return "dashboard";
	}

	@GetMapping("/approve")
	public String Approve(@RequestParam int id) {
		RequestsDao dao = new RequestsDao();
		dao.approve(id);
		return "admindashboard";
	}

	@GetMapping("/reject")
	public String Reject(@RequestParam int id) {
		RequestsDao dao = new RequestsDao();
		dao.reject(id);
		return "admindashboard";
	}

}
