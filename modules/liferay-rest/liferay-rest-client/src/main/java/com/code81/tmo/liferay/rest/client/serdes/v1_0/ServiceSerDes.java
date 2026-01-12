package com.code81.tmo.liferay.rest.client.serdes.v1_0;

import com.code81.tmo.liferay.rest.client.dto.v1_0.Service;
import com.code81.tmo.liferay.rest.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Mahmoud.Khalil
 * @generated
 */
@Generated("")
public class ServiceSerDes {

	public static Service toDTO(String json) {
		ServiceJSONParser serviceJSONParser = new ServiceJSONParser();

		return serviceJSONParser.parseToDTO(json);
	}

	public static Service[] toDTOs(String json) {
		ServiceJSONParser serviceJSONParser = new ServiceJSONParser();

		return serviceJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Service service) {
		if (service == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (service.getBrief() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"brief\": ");

			sb.append("\"");

			sb.append(_escape(service.getBrief()));

			sb.append("\"");
		}

		if (service.getCode() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"code\": ");

			sb.append("\"");

			sb.append(_escape(service.getCode()));

			sb.append("\"");
		}

		if (service.getDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"date\": ");

			sb.append("\"");

			sb.append(_escape(service.getDate()));

			sb.append("\"");
		}

		if (service.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(service.getDescription()));

			sb.append("\"");
		}

		if (service.getDocuments() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documents\": ");

			sb.append("[");

			for (int i = 0; i < service.getDocuments().length; i++) {
				sb.append(_toJSON(service.getDocuments()[i]));

				if ((i + 1) < service.getDocuments().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (service.getExpecterResponseTime() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"expecterResponseTime\": ");

			sb.append(service.getExpecterResponseTime());
		}

		if (service.getExternalUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"externalUrl\": ");

			sb.append("\"");

			sb.append(_escape(service.getExternalUrl()));

			sb.append("\"");
		}

		if (service.getImageUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imageUrl\": ");

			sb.append("\"");

			sb.append(_escape(service.getImageUrl()));

			sb.append("\"");
		}

		if (service.getOutcome() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outcome\": ");

			sb.append("\"");

			sb.append(_escape(service.getOutcome()));

			sb.append("\"");
		}

		if (service.getProcedure() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"procedure\": ");

			sb.append("\"");

			sb.append(_escape(service.getProcedure()));

			sb.append("\"");
		}

		if (service.getSource() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"source\": ");

			sb.append("\"");

			sb.append(_escape(service.getSource()));

			sb.append("\"");
		}

		if (service.getTermsAndConditions() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"termsAndConditions\": ");

			sb.append("\"");

			sb.append(_escape(service.getTermsAndConditions()));

			sb.append("\"");
		}

		if (service.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(service.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ServiceJSONParser serviceJSONParser = new ServiceJSONParser();

		return serviceJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Service service) {
		if (service == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (service.getBrief() == null) {
			map.put("brief", null);
		}
		else {
			map.put("brief", String.valueOf(service.getBrief()));
		}

		if (service.getCode() == null) {
			map.put("code", null);
		}
		else {
			map.put("code", String.valueOf(service.getCode()));
		}

		if (service.getDate() == null) {
			map.put("date", null);
		}
		else {
			map.put("date", String.valueOf(service.getDate()));
		}

		if (service.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(service.getDescription()));
		}

		if (service.getDocuments() == null) {
			map.put("documents", null);
		}
		else {
			map.put("documents", String.valueOf(service.getDocuments()));
		}

		if (service.getExpecterResponseTime() == null) {
			map.put("expecterResponseTime", null);
		}
		else {
			map.put(
				"expecterResponseTime",
				String.valueOf(service.getExpecterResponseTime()));
		}

		if (service.getExternalUrl() == null) {
			map.put("externalUrl", null);
		}
		else {
			map.put("externalUrl", String.valueOf(service.getExternalUrl()));
		}

		if (service.getImageUrl() == null) {
			map.put("imageUrl", null);
		}
		else {
			map.put("imageUrl", String.valueOf(service.getImageUrl()));
		}

		if (service.getOutcome() == null) {
			map.put("outcome", null);
		}
		else {
			map.put("outcome", String.valueOf(service.getOutcome()));
		}

		if (service.getProcedure() == null) {
			map.put("procedure", null);
		}
		else {
			map.put("procedure", String.valueOf(service.getProcedure()));
		}

		if (service.getSource() == null) {
			map.put("source", null);
		}
		else {
			map.put("source", String.valueOf(service.getSource()));
		}

		if (service.getTermsAndConditions() == null) {
			map.put("termsAndConditions", null);
		}
		else {
			map.put(
				"termsAndConditions",
				String.valueOf(service.getTermsAndConditions()));
		}

		if (service.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(service.getTitle()));
		}

		return map;
	}

	public static class ServiceJSONParser extends BaseJSONParser<Service> {

		@Override
		protected Service createDTO() {
			return new Service();
		}

		@Override
		protected Service[] createDTOArray(int size) {
			return new Service[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "brief")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "code")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "date")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "documents")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "expecterResponseTime")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "externalUrl")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "imageUrl")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "outcome")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "procedure")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "source")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "termsAndConditions")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			Service service, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "brief")) {
				if (jsonParserFieldValue != null) {
					service.setBrief((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "code")) {
				if (jsonParserFieldValue != null) {
					service.setCode((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "date")) {
				if (jsonParserFieldValue != null) {
					service.setDate((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					service.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "documents")) {
				if (jsonParserFieldValue != null) {
					service.setDocuments(
						toStrings((Object[])jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "expecterResponseTime")) {

				if (jsonParserFieldValue != null) {
					service.setExpecterResponseTime(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "externalUrl")) {
				if (jsonParserFieldValue != null) {
					service.setExternalUrl((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "imageUrl")) {
				if (jsonParserFieldValue != null) {
					service.setImageUrl((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "outcome")) {
				if (jsonParserFieldValue != null) {
					service.setOutcome((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "procedure")) {
				if (jsonParserFieldValue != null) {
					service.setProcedure((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "source")) {
				if (jsonParserFieldValue != null) {
					service.setSource((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "termsAndConditions")) {

				if (jsonParserFieldValue != null) {
					service.setTermsAndConditions((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					service.setTitle((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			sb.append(_toJSON(value));

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static String _toJSON(Object value) {
		if (value == null) {
			return "null";
		}

		if (value instanceof Map) {
			return _toJSON((Map)value);
		}

		Class<?> clazz = value.getClass();

		if (clazz.isArray()) {
			StringBuilder sb = new StringBuilder("[");

			Object[] values = (Object[])value;

			for (int i = 0; i < values.length; i++) {
				sb.append(_toJSON(values[i]));

				if ((i + 1) < values.length) {
					sb.append(", ");
				}
			}

			sb.append("]");

			return sb.toString();
		}

		if (value instanceof String) {
			return "\"" + _escape(value) + "\"";
		}

		return String.valueOf(value);
	}

}