package com.vev.bsmj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vev.bsmj.excep.BookStoreException;
import com.vev.bsmj.model.Book;
import com.vev.bsmj.util.ConnectionFactory;

public class BookDAOJdbcImpl implements BookDAO {

	public Book add(Book book) throws BookStoreException {
		if (book != null) {
			try (Connection con = ConnectionFactory.getConnection();
					PreparedStatement pst = con.prepareStatement(INSERT_BOOK);) {
				pst.setString(1, book.getBcode());
				pst.setString(2, book.getTitle());
				pst.setDouble(3, book.getPrice());
				pst.executeUpdate();

			} catch (SQLException excep) {
				throw new BookStoreException("Book could not be saved");
			}
		}
		return book;
	}

	public boolean delete(String bcode) throws BookStoreException {
		boolean isDeleted = false;
		try (Connection con = ConnectionFactory.getConnection();
			 PreparedStatement pst = con.prepareStatement(DELETE_BOOK);) {

			pst.setString(1, bcode);
			int rowCount = pst.executeUpdate();
			isDeleted = rowCount > 0;
		} catch (SQLException excep) {
			throw new BookStoreException("Book could not be deleted");
		}
		return isDeleted;
	}

	public Book get(String bcode) throws BookStoreException {
		Book book = null;
		try (Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(GET_BOOK_BY_BCODE);) {

			pst.setString(1, bcode);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				book = new Book(rs.getString(1), rs.getString(2), rs.getDouble(3));
			}
		} catch (SQLException excep) {
			throw new BookStoreException("No such Book available");
		}

		return book;
	}

	public List<Book> getAllBooks() throws BookStoreException {
		List<Book> books = new ArrayList<>();
		
		try (Connection con = ConnectionFactory.getConnection();
			 PreparedStatement pst = con.prepareStatement(GET_ALL_BOOKS);) {
				
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					Book book = new Book(rs.getString(1), rs.getString(2), rs.getDouble(3));
					books.add(book);
				}
				
				if (books.isEmpty()) {
					books = null;
				}
		} catch(SQLException excep) {
			throw new BookStoreException("books can not be retrieved");
		}
		
		return books;
	}

}
