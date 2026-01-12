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
@GraphQLName("Service")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Service")
public class Service implements Serializable {

	public static Service toDTO(String json) {
		return ObjectMapperUtil.readValue(Service.class, json);
	}

	public static Service unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Service.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getBrief() {
		if (_briefSupplier != null) {
			brief = _briefSupplier.get();

			_briefSupplier = null;
		}

		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;

		_briefSupplier = null;
	}

	@JsonIgnore
	public void setBrief(
		UnsafeSupplier<String, Exception> briefUnsafeSupplier) {

		_briefSupplier = () -> {
			try {
				return briefUnsafeSupplier.get();
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
	protected String brief;

	@JsonIgnore
	private Supplier<String> _briefSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCode() {
		if (_codeSupplier != null) {
			code = _codeSupplier.get();

			_codeSupplier = null;
		}

		return code;
	}

	public void setCode(String code) {
		this.code = code;

		_codeSupplier = null;
	}

	@JsonIgnore
	public void setCode(UnsafeSupplier<String, Exception> codeUnsafeSupplier) {
		_codeSupplier = () -> {
			try {
				return codeUnsafeSupplier.get();
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
	protected String code;

	@JsonIgnore
	private Supplier<String> _codeSupplier;

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
	public String[] getDocuments() {
		if (_documentsSupplier != null) {
			documents = _documentsSupplier.get();

			_documentsSupplier = null;
		}

		return documents;
	}

	public void setDocuments(String[] documents) {
		this.documents = documents;

		_documentsSupplier = null;
	}

	@JsonIgnore
	public void setDocuments(
		UnsafeSupplier<String[], Exception> documentsUnsafeSupplier) {

		_documentsSupplier = () -> {
			try {
				return documentsUnsafeSupplier.get();
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
	protected String[] documents;

	@JsonIgnore
	private Supplier<String[]> _documentsSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Integer getExpecterResponseTime() {
		if (_expecterResponseTimeSupplier != null) {
			expecterResponseTime = _expecterResponseTimeSupplier.get();

			_expecterResponseTimeSupplier = null;
		}

		return expecterResponseTime;
	}

	public void setExpecterResponseTime(Integer expecterResponseTime) {
		this.expecterResponseTime = expecterResponseTime;

		_expecterResponseTimeSupplier = null;
	}

	@JsonIgnore
	public void setExpecterResponseTime(
		UnsafeSupplier<Integer, Exception> expecterResponseTimeUnsafeSupplier) {

		_expecterResponseTimeSupplier = () -> {
			try {
				return expecterResponseTimeUnsafeSupplier.get();
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
	protected Integer expecterResponseTime;

	@JsonIgnore
	private Supplier<Integer> _expecterResponseTimeSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getExternalUrl() {
		if (_externalUrlSupplier != null) {
			externalUrl = _externalUrlSupplier.get();

			_externalUrlSupplier = null;
		}

		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;

		_externalUrlSupplier = null;
	}

	@JsonIgnore
	public void setExternalUrl(
		UnsafeSupplier<String, Exception> externalUrlUnsafeSupplier) {

		_externalUrlSupplier = () -> {
			try {
				return externalUrlUnsafeSupplier.get();
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
	protected String externalUrl;

	@JsonIgnore
	private Supplier<String> _externalUrlSupplier;

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
	public String getOutcome() {
		if (_outcomeSupplier != null) {
			outcome = _outcomeSupplier.get();

			_outcomeSupplier = null;
		}

		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;

		_outcomeSupplier = null;
	}

	@JsonIgnore
	public void setOutcome(
		UnsafeSupplier<String, Exception> outcomeUnsafeSupplier) {

		_outcomeSupplier = () -> {
			try {
				return outcomeUnsafeSupplier.get();
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
	protected String outcome;

	@JsonIgnore
	private Supplier<String> _outcomeSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getProcedure() {
		if (_procedureSupplier != null) {
			procedure = _procedureSupplier.get();

			_procedureSupplier = null;
		}

		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;

		_procedureSupplier = null;
	}

	@JsonIgnore
	public void setProcedure(
		UnsafeSupplier<String, Exception> procedureUnsafeSupplier) {

		_procedureSupplier = () -> {
			try {
				return procedureUnsafeSupplier.get();
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
	protected String procedure;

	@JsonIgnore
	private Supplier<String> _procedureSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getSource() {
		if (_sourceSupplier != null) {
			source = _sourceSupplier.get();

			_sourceSupplier = null;
		}

		return source;
	}

	public void setSource(String source) {
		this.source = source;

		_sourceSupplier = null;
	}

	@JsonIgnore
	public void setSource(
		UnsafeSupplier<String, Exception> sourceUnsafeSupplier) {

		_sourceSupplier = () -> {
			try {
				return sourceUnsafeSupplier.get();
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
	protected String source;

	@JsonIgnore
	private Supplier<String> _sourceSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTermsAndConditions() {
		if (_termsAndConditionsSupplier != null) {
			termsAndConditions = _termsAndConditionsSupplier.get();

			_termsAndConditionsSupplier = null;
		}

		return termsAndConditions;
	}

	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;

		_termsAndConditionsSupplier = null;
	}

	@JsonIgnore
	public void setTermsAndConditions(
		UnsafeSupplier<String, Exception> termsAndConditionsUnsafeSupplier) {

		_termsAndConditionsSupplier = () -> {
			try {
				return termsAndConditionsUnsafeSupplier.get();
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
	protected String termsAndConditions;

	@JsonIgnore
	private Supplier<String> _termsAndConditionsSupplier;

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

		if (!(object instanceof Service)) {
			return false;
		}

		Service service = (Service)object;

		return Objects.equals(toString(), service.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String brief = getBrief();

		if (brief != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"brief\": ");

			sb.append("\"");

			sb.append(_escape(brief));

			sb.append("\"");
		}

		String code = getCode();

		if (code != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"code\": ");

			sb.append("\"");

			sb.append(_escape(code));

			sb.append("\"");
		}

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

		String[] documents = getDocuments();

		if (documents != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documents\": ");

			sb.append("[");

			for (int i = 0; i < documents.length; i++) {
				sb.append("\"");

				sb.append(_escape(documents[i]));

				sb.append("\"");

				if ((i + 1) < documents.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		Integer expecterResponseTime = getExpecterResponseTime();

		if (expecterResponseTime != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expecterResponseTime\": ");

			sb.append(expecterResponseTime);
		}

		String externalUrl = getExternalUrl();

		if (externalUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalUrl\": ");

			sb.append("\"");

			sb.append(_escape(externalUrl));

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

		String outcome = getOutcome();

		if (outcome != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outcome\": ");

			sb.append("\"");

			sb.append(_escape(outcome));

			sb.append("\"");
		}

		String procedure = getProcedure();

		if (procedure != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"procedure\": ");

			sb.append("\"");

			sb.append(_escape(procedure));

			sb.append("\"");
		}

		String source = getSource();

		if (source != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"source\": ");

			sb.append("\"");

			sb.append(_escape(source));

			sb.append("\"");
		}

		String termsAndConditions = getTermsAndConditions();

		if (termsAndConditions != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"termsAndConditions\": ");

			sb.append("\"");

			sb.append(_escape(termsAndConditions));

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
		defaultValue = "com.code81.tmo.liferay.rest.dto.v1_0.Service",
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