package com.santhosh.collections;

public class Movie {

	private String name, actor;
	private int releaseYr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getReleaseYr() {
		return releaseYr;
	}

	public void setReleaseYr(int releaseYear) {
		this.releaseYr = releaseYear;
	}

	@Override
	public boolean equals(Object o) {
		Movie m = (Movie) o;
		return m.actor.equals(this.actor) && m.name.equals(this.name) && m.releaseYr == this.releaseYr;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", actor=" + actor + ", releaseYr=" + releaseYr + "]";
	}

}
