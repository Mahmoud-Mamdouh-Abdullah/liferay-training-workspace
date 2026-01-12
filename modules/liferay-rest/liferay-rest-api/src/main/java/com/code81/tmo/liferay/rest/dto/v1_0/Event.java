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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
@GraphQLName("Event")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Event")
public class Event implements Serializable {

	public static Event toDTO(String json) {
		return ObjectMapperUtil.readValue(Event.class, json);
	}

	public static Event unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Event.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getDate() {
		if (_dateSupplier != null) {
			date = _dateSupplier.get();

			_dateSupplier = null;
		}

		return date;
	}

	public void setDate(String date) {
		this.date = date;

		_dateSupplier = null;
	}

	@JsonIgnore
	public void setDate(UnsafeSupplier<String, Exception> dateUnsafeSupplier) {
		_dateSupplier = () -> {
			try {
				return dateUnsafeSupplier.get();
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
	protected String date;

	@JsonIgnore
	private Supplier<String> _dateSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getDescription() {
		if (_descriptionSupplier != null) {
			description = _descriptionSupplier.get();

			_descriptionSupplier = null;
		}

		return description;
	}

	public void setDescription(String description) {
		this.description = description;

		_descriptionSupplier = null;
	}

	@JsonIgnore
	public void setDescription(
		UnsafeSupplier<String, Exception> descriptionUnsafeSupplier) {

		_descriptionSupplier = () -> {
			try {
				return descriptionUnsafeSupplier.get();
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
	protected String description;

	@JsonIgnore
	private Supplier<String> _descriptionSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getImageUrl() {
		if (_imageUrlSupplier != null) {
			imageUrl = _imageUrlSupplier.get();

			_imageUrlSupplier = null;
		}

		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;

		_imageUrlSupplier = null;
	}

	@JsonIgnore
	public void setImageUrl(
		UnsafeSupplier<String, Exception> imageUrlUnsafeSupplier) {

		_imageUrlSupplier = () -> {
			try {
				return imageUrlUnsafeSupplier.get();
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
	protected String imageUrl;

	@JsonIgnore
	private Supplier<String> _imageUrlSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getLink() {
		if (_linkSupplier != null) {
			link = _linkSupplier.get();

			_linkSupplier = null;
		}

		return link;
	}

	public void setLink(String link) {
		this.link = link;

		_linkSupplier = null;
	}

	@JsonIgnore
	public void setLink(UnsafeSupplier<String, Exception> linkUnsafeSupplier) {
		_linkSupplier = () -> {
			try {
				return linkUnsafeSupplier.get();
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
	protected String link;

	@JsonIgnore
	private Supplier<String> _linkSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getLocation() {
		if (_locationSupplier != null) {
			location = _locationSupplier.get();

			_locationSupplier = null;
		}

		return location;
	}

	public void setLocation(String location) {
		this.location = location;

		_locationSupplier = null;
	}

	@JsonIgnore
	public void setLocation(
		UnsafeSupplier<String, Exception> locationUnsafeSupplier) {

		_locationSupplier = () -> {
			try {
				return locationUnsafeSupplier.get();
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
	protected String location;

	@JsonIgnore
	private Supplier<String> _locationSupplier;

	@io.swagger.v3.oas.annotations.media.Schema(example = "08:00 AM")
	public String getTimeFrom() {
		if (_timeFromSupplier != null) {
			timeFrom = _timeFromSupplier.get();

			_timeFromSupplier = null;
		}

		return timeFrom;
	}

	public void setTimeFrom(String timeFrom) {
		this.timeFrom = timeFrom;

		_timeFromSupplier = null;
	}

	@JsonIgnore
	public void setTimeFrom(
		UnsafeSupplier<String, Exception> timeFromUnsafeSupplier) {

		_timeFromSupplier = () -> {
			try {
				return timeFromUnsafeSupplier.get();
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
	protected String timeFrom;

	@JsonIgnore
	private Supplier<String> _timeFromSupplier;

	@io.swagger.v3.oas.annotations.media.Schema(example = "12:00 PM")
	public String getTimeTo() {
		if (_timeToSupplier != null) {
			timeTo = _timeToSupplier.get();

			_timeToSupplier = null;
		}

		return timeTo;
	}

	public void setTimeTo(String timeTo) {
		this.timeTo = timeTo;

		_timeToSupplier = null;
	}

	@JsonIgnore
	public void setTimeTo(
		UnsafeSupplier<String, Exception> timeToUnsafeSupplier) {

		_timeToSupplier = () -> {
			try {
				return timeToUnsafeSupplier.get();
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
	protected String timeTo;

	@JsonIgnore
	private Supplier<String> _timeToSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTitle() {
		if (_titleSupplier != null) {
			title = _titleSupplier.get();

			_titleSupplier = null;
		}

		return title;
	}

	public void setTitle(String title) {
		this.title = title;

		_titleSupplier = null;
	}

	@JsonIgnore
	public void setTitle(
		UnsafeSupplier<String, Exception> titleUnsafeSupplier) {

		_titleSupplier = () -> {
			try {
				return titleUnsafeSupplier.get();
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
	protected String title;

	@JsonIgnore
	private Supplier<String> _titleSupplier;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		String date = getDate();

		if (date != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"date\": ");

			sb.append("\"");

			sb.append(_escape(date));

			sb.append("\"");
		}

		String description = getDescription();

		if (description != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(description));

			sb.append("\"");
		}

		String imageUrl = getImageUrl();

		if (imageUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imageUrl\": ");

			sb.append("\"");

			sb.append(_escape(imageUrl));

			sb.append("\"");
		}

		String link = getLink();

		if (link != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"link\": ");

			sb.append("\"");

			sb.append(_escape(link));

			sb.append("\"");
		}

		String location = getLocation();

		if (location != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"location\": ");

			sb.append("\"");

			sb.append(_escape(location));

			sb.append("\"");
		}

		String timeFrom = getTimeFrom();

		if (timeFrom != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"timeFrom\": ");

			sb.append("\"");

			sb.append(_escape(timeFrom));

			sb.append("\"");
		}

		String timeTo = getTimeTo();

		if (timeTo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"timeTo\": ");

			sb.append("\"");

			sb.append(_escape(timeTo));

			sb.append("\"");
		}

		String title = getTitle();

		if (title != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(title));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "com.code81.tmo.liferay.rest.dto.v1_0.Event",
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