package com.code81.tmo.liferay.rest.client.dto.v1_0;

import com.code81.tmo.liferay.rest.client.function.UnsafeSupplier;
import com.code81.tmo.liferay.rest.client.serdes.v1_0.SourcesResponseSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
public class SourcesResponse implements Cloneable, Serializable {

	public static SourcesResponse toDTO(String json) {
		return SourcesResponseSerDes.toDTO(json);
	}

	public String[] getSources() {
		return sources;
	}

	public void setSources(String[] sources) {
		this.sources = sources;
	}

	public void setSources(
		UnsafeSupplier<String[], Exception> sourcesUnsafeSupplier) {

		try {
			sources = sourcesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String[] sources;

	@Override
	public SourcesResponse clone() throws CloneNotSupportedException {
		return (SourcesResponse)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SourcesResponse)) {
			return false;
		}

		SourcesResponse sourcesResponse = (SourcesResponse)object;

		return Objects.equals(toString(), sourcesResponse.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return SourcesResponseSerDes.toJSON(this);
	}

}