package com.mycompany.app.movie;

 
public class Movie {
	private  String title;
	private  String producer;
	private  String releaseDate;

	public Movie() {
		//NOOP;
	}
	public Movie(final String title, final String producer, final String releaseDate) {
		this.title = title;
		this.producer = producer;
		this.releaseDate = releaseDate;
	}

	public String getTitle() {
		return title;
	}

	public String getProducer() {
		return producer;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder
			.append("Movie [title=").append(title)
			.append(", producer=").append(producer)
			.append(", published=").append(releaseDate).append("]");
		return builder.toString();
	}
}