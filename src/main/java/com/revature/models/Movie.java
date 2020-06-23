package com.revature.models;

public class Movie {
	private int id;
	private String title;
	private String genre;
	private Actor starringActor;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Actor getStarringActor() {
		return starringActor;
	}

	public void setStarringActor(Actor starringActor) {
		this.starringActor = starringActor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", starringActor=" + starringActor + "]";
	}

	public Movie(int id, String title, String genre) {
		super();
		System.out.println("Movie " + title + "  created with params");
		this.id = id;
		this.title = title;
		this.genre = genre;
	}

	public Movie() {
		super();
		System.out.println("Movie created without params");
	}

}
