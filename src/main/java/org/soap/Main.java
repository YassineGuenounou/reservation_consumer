package org.soap;

import org.soap.proxy.books.Book;
import org.soap.proxy.books.BookWebServiceService;
import org.soap.proxy.books.Books;
import org.soap.proxy.reservations.Reservation;
import org.soap.proxy.reservations.ReservationWebServiceService;
import org.soap.proxy.reservations.Reservations;
import org.soap.proxy.users.User;
import org.soap.proxy.users.UserWebServiceService;
import org.soap.proxy.users.Users;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Book Title");
        book.setAuthor("Author");
        book.setId(0);
        Books booksProxy = new BookWebServiceService().getBooksPort();
        booksProxy.addBook(book);
        System.out.println(booksProxy.getAllBooks().get(0).getTitle());

        Users usersProxy = new UserWebServiceService().getUsersPort();
        User user = new User();
        user.setEmail("test@test.test");
        user.setPassword("test");
        user.setId(0);
        usersProxy.addUser(user);
        System.out.println(usersProxy.getAllUsers().get(0).getEmail());

        Reservations reservationsProxy = new ReservationWebServiceService().getReservationsPort();

        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setBookId(0);
        reservation.setUserId(0);
        reservation.setDateDebut("2020-01-01");
        reservation.setDateFin("2021-01-01");

        reservationsProxy.addReservation(reservation);
        System.out.println(reservationsProxy.getAllReservations().get(0).getId());

    }
}