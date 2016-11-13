package ma.samidev.discorum.dao.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import ma.samidev.discorum.entite.Genre;

@Converter
public class GenreConverter implements AttributeConverter<Genre, String> {

	@Override
	public String convertToDatabaseColumn(Genre genre) {
		return genre.getValeur();
	}

	@Override
	public Genre convertToEntityAttribute(String valeur) {
		switch (valeur) {
		case "F":
			return Genre.FEMALE;
		case "M":
			return Genre.MALE;
		default:
			throw new IllegalArgumentException("La valeur : " + valeur + " est inconnue");
		}
	}

}
