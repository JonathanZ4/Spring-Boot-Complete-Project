package com.tts.BlogProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
	//sets the Id as the Primary Key
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id; 
    private String title;
    private String author;
    private String blogEntry;
	
	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	
    
    public BlogPost(String title, String author, String blogEntry) {
        this.title = title; 
        this.author = author;
	this.blogEntry = blogEntry;
    }
    
    public BlogPost(){
        //non-argument constructor needed for JPA
    }
}