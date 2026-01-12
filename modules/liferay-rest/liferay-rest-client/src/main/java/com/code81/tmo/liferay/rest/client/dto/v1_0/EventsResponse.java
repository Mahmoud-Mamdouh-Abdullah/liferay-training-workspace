package com.code81.tmo.liferay.rest.client.dto.v1_0;

import com.code81.tmo.liferay.rest.client.function.UnsafeSupplier;
import com.code81.tmo.liferay.rest.client.serdes.v1_0.EventsResponseSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
public class EventsResponse implements Cloneable, Serializable {

	public static EventsResponse toDTO(String json) {
		return EventsResponseSerDes.toDTO(json);
	}

	public Event[] getEvents() {
		return events;
	}

	public void setEvents(Event[] events) {
		this.events = events;
	}

	public void setEvents(
		UnsafeSupplier<Event[], Exception> eventsUnsafeSupplier) {

		try {
			events = eventsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Event[] events;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setPage(UnsafeSupplier<Integer, Exception> pageUnsafeSupplier) {
		try {
			page = pageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer page;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void setSize(UnsafeSupplier<Integer, Exception> sizeUnsafeSupplier) {
		try {
			size = sizeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer size;

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public void setTotalCount(
		UnsafeSupplier<Long, Exception> totalCountUnsafeSupplier) {

		try {
			totalCount = totalCountUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long totalCount;

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public void setTotalPages(
		UnsafeSupplier<Integer, Exception> totalPagesUnsafeSupplier) {

		try {
			totalPages = totalPagesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer totalPages;

	@Override
	public EventsResponse clone() throws CloneNotSupportedException {
		return (EventsResponse)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EventsResponse)) {
			return false;
		}

		EventsResponse eventsResponse = (EventsResponse)object;

		return Objects.equals(toString(), eventsResponse.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return EventsResponseSerDes.toJSON(this);
	}

}