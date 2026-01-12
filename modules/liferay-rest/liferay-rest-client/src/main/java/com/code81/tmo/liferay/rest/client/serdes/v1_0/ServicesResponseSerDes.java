package com.code81.tmo.liferay.rest.client.serdes.v1_0;

import com.code81.tmo.liferay.rest.client.dto.v1_0.Service;
import com.code81.tmo.liferay.rest.client.dto.v1_0.ServicesResponse;
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
public class ServicesResponseSerDes {

	public static ServicesResponse toDTO(String json) {
		ServicesResponseJSONParser servicesResponseJSONParser =
			new ServicesResponseJSONParser();

		return servicesResponseJSONParser.parseToDTO(json);
	}

	public static ServicesResponse[] toDTOs(String json) {
		ServicesResponseJSONParser servicesResponseJSONParser =
			new ServicesResponseJSONParser();

		return servicesResponseJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ServicesResponse servicesResponse) {
		if (servicesResponse == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (servicesResponse.getPage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"page\": ");

			sb.append(servicesResponse.getPage());
		}

		if (servicesResponse.getServices() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"services\": ");

			sb.append("[");

			for (int i = 0; i < servicesResponse.getServices().length; i++) {
				sb.append(String.valueOf(servicesResponse.getServices()[i]));

				if ((i + 1) < servicesResponse.getServices().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (servicesResponse.getSize() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"size\": ");

			sb.append(servicesResponse.getSize());
		}

		if (servicesResponse.getTotalCount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalCount\": ");

			sb.append(servicesResponse.getTotalCount());
		}

		if (servicesResponse.getTotalPages() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalPages\": ");

			sb.append(servicesResponse.getTotalPages());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ServicesResponseJSONParser servicesResponseJSONParser =
			new ServicesResponseJSONParser();

		return servicesResponseJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(ServicesResponse servicesResponse) {
		if (servicesResponse == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (servicesResponse.getPage() == null) {
			map.put("page", null);
		}
		else {
			map.put("page", String.valueOf(servicesResponse.getPage()));
		}

		if (servicesResponse.getServices() == null) {
			map.put("services", null);
		}
		else {
			map.put("services", String.valueOf(servicesResponse.getServices()));
		}

		if (servicesResponse.getSize() == null) {
			map.put("size", null);
		}
		else {
			map.put("size", String.valueOf(servicesResponse.getSize()));
		}

		if (servicesResponse.getTotalCount() == null) {
			map.put("totalCount", null);
		}
		else {
			map.put(
				"totalCount", String.valueOf(servicesResponse.getTotalCount()));
		}

		if (servicesResponse.getTotalPages() == null) {
			map.put("totalPages", null);
		}
		else {
			map.put(
				"totalPages", String.valueOf(servicesResponse.getTotalPages()));
		}

		return map;
	}

	public static class ServicesResponseJSONParser
		extends BaseJSONParser<ServicesResponse> {

		@Override
		protected ServicesResponse createDTO() {
			return new ServicesResponse();
		}

		@Override
		protected ServicesResponse[] createDTOArray(int size) {
			return new ServicesResponse[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "page")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "services")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "size")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "totalPages")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			ServicesResponse servicesResponse, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					servicesResponse.setPage(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "services")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					Service[] servicesArray =
						new Service[jsonParserFieldValues.length];

					for (int i = 0; i < servicesArray.length; i++) {
						servicesArray[i] = ServiceSerDes.toDTO(
							(String)jsonParserFieldValues[i]);
					}

					servicesResponse.setServices(servicesArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "size")) {
				if (jsonParserFieldValue != null) {
					servicesResponse.setSize(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					servicesResponse.setTotalCount(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalPages")) {
				if (jsonParserFieldValue != null) {
					servicesResponse.setTotalPages(
						Integer.valueOf((String)jsonParserFieldValue));
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