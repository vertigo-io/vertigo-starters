package lollipop.domain.movies;

import io.vertigo.core.lang.Generated;
import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
@io.vertigo.dynamo.ngdomain.annotations.Mapper(clazz = io.vertigo.dynamo.domain.util.JsonMapper.class, dataType = io.vertigo.dynamo.domain.metamodel.DataType.String)
public final class MovieDisplay implements DtObject {
	private static final long serialVersionUID = 1L;

	private Long movId;
	private String title;
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'id'.
	 * @return Long movId
	 */
	@Field(domain = "STyId", label = "id")
	public Long getMovId() {
		return movId;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'id'.
	 * @param movId Long
	 */
	public void setMovId(final Long movId) {
		this.movId = movId;
	}
	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Title'.
	 * @return String title
	 */
	@Field(domain = "STyLabel", label = "Title")
	public String getTitle() {
		return title;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Title'.
	 * @param title String
	 */
	public void setTitle(final String title) {
		this.title = title;
	}
	
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}