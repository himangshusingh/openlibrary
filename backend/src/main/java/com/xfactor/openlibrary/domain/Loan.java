package com.xfactor.openlibrary.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int bookid;
    @Column
    private int studentid;
    @Column
    private String checkoutdate;
    @Column
    private String duedate;
    @Column
    private String returnDate;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getCheckoutdate() {
        return checkoutdate;
    }
    public void setCheckoutdate(String checkoutdate) {
        this.checkoutdate = checkoutdate;
    }
    public String getDuedate() {
        return duedate;
    }
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    } 
}
