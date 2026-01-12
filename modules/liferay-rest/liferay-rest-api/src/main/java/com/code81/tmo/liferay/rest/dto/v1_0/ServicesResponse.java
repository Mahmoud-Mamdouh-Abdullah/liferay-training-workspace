package com.code81.tmo.liferay.rest.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
@GraphQLName("ServicesResponse")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ServicesResponse")
public class ServicesResponse implements Serializable {

	public static ServicesResponse toDTO(String json) {
		return ObjectMapperUtil.readValue(ServicesResponse.class, json);
	}

	public static ServicesResponse unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ServicesResponse.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Integer getPage() {
		if (_pageSupplier != null) {
			page = _pageSupplier.get();

			_pageSupplier = null;
		}

		return page;
	}

	public void setPage(Integer page) {
		this.page = page;

		_pageSupplier = null;
	}

	@JsonIgnore
	public void setPage(UnsafeSupplier<Integer, Exception> pageUnsafeSupplier) {
		_pageSupplier = () -> {
			try {
				return pageUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer page;

	@JsonIgnore
	private Supplier<Integer> _pageSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public Service[] getServices() {
		if (_servicesSupplier != null) {
			services = _servicesSupplier.get();

			_servicesSupplier = null;
		}

		return services;
	}

	public void setServices(Service[] services) {
		this.services = services;

		_servicesSupplier = null;
	}

	@JsonIgnore
	public void setServices(
		UnsafeSupplier<Service[], Exception> servicesUnsafeSupplier) {

		_servicesSupplier = () -> {
			try {
				return servicesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Service[] services;

	@JsonIgnore
	private Supplier<Service[]> _servicesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Integer getSize() {
		if (_sizeSupplier != null) {
			size = _sizeSupplier.get();

			_sizeSupplier = null;
		}

		return size;
	}

	public void setSize(Integer size) {
		this.size = size;

		_sizeSupplier = null;
	}

	@JsonIgnore
	public void setSize(UnsafeSupplier<Integer, Exception> sizeUnsafeSupplier) {
		_sizeSupplier = () -> {
			try {
				return sizeUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer size;

	@JsonIgnore
	private Supplier<Integer> _sizeSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getTotalCount() {
		if (_totalCountSupplier != null) {
			totalCount = _totalCountSupplier.get();

			_totalCountSupplier = null;
		}

		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;

		_totalCountSupplier = null;
	}

	@JsonIgnore
	public void setTotalCount(
		UnsafeSupplier<Long, Exception> totalCountUnsafeSupplier) {

		_totalCountSupplier = () -> {
			try {
				return totalCountUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long totalCount;

	@JsonIgnore
	private Supplier<Long> _totalCountSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Integer getTotalPages() {
		if (_totalPagesSupplier != null) {
			totalPages = _totalPagesSupplier.get();

			_totalPagesSupplier = null;
		}

		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;

		_totalPagesSupplier = null;
	}

	@JsonIgnore
	public void setTotalPages(
		UnsafeSupplier<Integer, Exception> totalPagesUnsafeSupplier) {

		_totalPagesSupplier = () -> {
			try {
				return totalPagesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer totalPages;

	@JsonIgnore
	private Supplier<Integer> _totalPagesSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ServicesResponse)) {
			return false;
		}

		ServicesResponse servicesResponse = (ServicesResponse)object;

		return Objects.equals(toString(), servicesResponse.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Integer page = getPage();

		if (page != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"page\": ");

			sb.append(page);
		}

		Service[] services = getServices();

		if (services != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"services\": ");

			sb.append("[");

			for (int i = 0; i < services.length; i++) {
				sb.append(String.valueOf(services[i]));

				if ((i + 1) < services.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		Integer size = getSize();

		if (size != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"size\": ");

			sb.append(size);
		}

		Long totalCount = getTotalCount();

		if (totalCount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalCount\": ");

			sb.append(totalCount);
		}

		Integer totalPages = getTotalPages();

		if (totalPages != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalPages\": ");

			sb.append(totalPages);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "com.code81.tmo.liferay.rest.dto.v1_0.ServicesResponse",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof Map) {
						sb.append(_toJSON((Map<String, ?>)valueArray[i]));
					}
					else if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

	private Map<String, Serializable> _extendedProperties;

}