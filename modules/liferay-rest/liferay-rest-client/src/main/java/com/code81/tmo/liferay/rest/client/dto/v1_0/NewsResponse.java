package com.code81.tmo.liferay.rest.client.dto.v1_0;

import com.code81.tmo.liferay.rest.client.function.UnsafeSupplier;
import com.code81.tmo.liferay.rest.client.serdes.v1_0.NewsResponseSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
public class NewsResponse implements Cloneable, Serializable {

	public static NewsResponse toDTO(String json) {
		return NewsResponseSerDes.toDTO(json);
	}

	public News[] getNewses() {
		return newses;
	}

	public void setNewses(News[] newses) {
		this.newses = newses;
	}

	public void setNewses(
		UnsafeSupplier<News[], Exception> newsesUnsafeSupplier) {

		try {
			newses = newsesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected News[] newses;

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
	public NewsResponse clone() throws CloneNotSupportedException {
		return (NewsResponse)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NewsResponse)) {
			return false;
		}

		NewsResponse newsResponse = (NewsResponse)object;

		return Objects.equals(toString(), newsResponse.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return NewsResponseSerDes.toJSON(this);
	}

}