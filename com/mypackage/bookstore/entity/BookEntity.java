package com.mypackage.bookstore.entity;

import java.io.Serializable;

public class BookEntity implements Serializable
{
    //private static final long serialVersionUID = 565042982092596511L;
    
    private Long bookId;
    private String name;
    private String description;
    private Integer availableQty;
    private Integer priceperQty;
    private String authorName;
    private String authorEmail;

    
    public Long getBookId()
    {
        return bookId;
    }
    public void setBookId(Long bookId)
    {
        this.bookId = bookId;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthorName()
    {
        return authorName;
    }
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    public String getAuthorEmail()
    {
        return authorEmail;
    }
    public void setAuthorEmail(String authorEmail)
    {
        this.authorEmail = authorEmail;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getAvailableQty()
    {
        return availableQty;
    }
    public void setAvailableQty(Integer availableQty)
    {
        this.availableQty = availableQty;
    }

    public Integer getPriceperQty()
    {
        return priceperQty;
    }
    public void setPriceperQty(Integer priceperQty)
    {
        this.priceperQty = priceperQty;  
    }  
}
