package com.mycompany.app.movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Movie catalog.
 */
public class Catalog {
	private final List<Movie> store = new ArrayList<Movie>();

	public void addMovie(final Movie movie) {
		store.add(movie);
	}

	public List<Movie> findMovieByKeyword(final String keyword) {
		List<Movie> result = new ArrayList<Movie>();

		for (Movie movie : store) {
			if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
				result.add(movie);
			}
		}
		return result;
	}
	
	public List<Movie> findMovieThatStartsWithKeyword(final String keyword) {
		throw new UnsupportedOperationException("IMPLEMENT ME!");
	}

	public List<Movie> findMovieByOrder(int index) {
		List<Movie> result = new ArrayList<>();
		result.add(store.get(index));
		return result;
	}

	public int getSize() {
		return store.size();
	}
}
