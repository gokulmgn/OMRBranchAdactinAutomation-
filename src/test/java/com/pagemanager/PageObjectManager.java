package com.pagemanager;

import com.Pages.BookHotelPage;
import com.Pages.BookingConfirmationPage;
import com.Pages.CancelBookingPage;
import com.Pages.LoginPage;
import com.Pages.SearchHotelPage;
import com.Pages.SelectHotelPage;

public class PageObjectManager {
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage bookingPage;
	
	public LoginPage getLoginPage() {
		return (loginPage == null)? loginPage = new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null)? searchHotelPage = new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null)? selectHotelPage = new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null)? bookHotelPage = new BookHotelPage():bookHotelPage;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage == null)? bookingConfirmationPage = new BookingConfirmationPage():bookingConfirmationPage;
	}
	public CancelBookingPage getBookingPage() {
		return (bookingPage == null)? bookingPage = new CancelBookingPage():bookingPage;
	}
	
	

}
