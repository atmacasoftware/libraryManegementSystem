package net.atmacacode.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowing")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_borrowing_id")
    private Long id;

    @Column(name = "book_borrowing_borrower_name")
    private String borrowerName;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrowing_borrowing_date")
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "book_borrowing_return_date")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "borrowing_book_id", referencedColumnName = "book_id")
    private Book book;

    public BookBorrowing() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
