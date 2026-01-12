package com.code81.tmo.liferay.rest.client.dto.v1_0;

import com.code81.tmo.liferay.rest.client.function.UnsafeSupplier;
import com.code81.tmo.liferay.rest.client.serdes.v1_0.EventSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
public class Event implements Cloneable, Serializable {

	public static Event toDTO(String json) {
		return EventSerDes.toDTO(json);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDate(UnsafeSupplier<String, Exception> dateUnsafeSupplier) {
		try {
			date = dateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String date;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		try {
			description = descriptionUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String description;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setImageUrl(
		UnsafeSupplier<String, Exception> imageUrlUnsafeSupplier) {

		try {
			imageUrl = imageUrlUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String imageUrl;

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setLink(UnsafeSupplier<String, Exception> linkUnsafeSupplier) {
		try {
			link = linkUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String link;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setLocation(
		UnsafeSupplier<String, Exception> locationUnsafeSupplier) {

		try {
			location = locationUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String location;

	public String getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(String timeFrom) {
		this.timeFrom = timeFrom;
	}

	public void setTimeFrom(
		UnsafeSupplier<String, Exception> timeFromUnsafeSupplier) {

		try {
			timeFrom = timeFromUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String timeFrom;

	public String getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(String timeTo) {
		this.timeTo = timeTo;
	}

	public void setTimeTo(
		UnsafeSupplier<String, Exception> timeToUnsafeSupplier) {

		try {
			timeTo = timeToUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String timeTo;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		try {
			title = titleUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String title;

	@Override
	public Event clone() throws CloneNotSupportedException {
		return (Event)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Event)) {
			return false;
		}

		Event event = (Event)object;

		return Objects.equals(toString(), event.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return EventSerDes.toJSON(this);
	}

}