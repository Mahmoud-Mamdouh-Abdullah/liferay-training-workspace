package com.code81.tmo.liferay.rest.client.serdes.v1_0;

import com.code81.tmo.liferay.rest.client.dto.v1_0.SourcesResponse;
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
public class SourcesResponseSerDes {

	public static SourcesResponse toDTO(String json) {
		SourcesResponseJSONParser sourcesResponseJSONParser =
			new SourcesResponseJSONParser();

		return sourcesResponseJSONParser.parseToDTO(json);
	}

	public static SourcesResponse[] toDTOs(String json) {
		SourcesResponseJSONParser sourcesResponseJSONParser =
			new SourcesResponseJSONParser();

		return sourcesResponseJSONParser.parseToDTOs(json);
	}

	public static String toJSON(SourcesResponse sourcesResponse) {
		if (sourcesResponse == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (sourcesResponse.getSources() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"sources\": ");

			sb.append("[");

			for (int i = 0; i < sourcesResponse.getSources().length; i++) {
				sb.append(_toJSON(sourcesResponse.getSources()[i]));

				if ((i + 1) < sourcesResponse.getSources().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		SourcesResponseJSONParser sourcesResponseJSONParser =
			new SourcesResponseJSONParser();

		return sourcesResponseJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(SourcesResponse sourcesResponse) {
		if (sourcesResponse == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (sourcesResponse.getSources() == null) {
			map.put("sources", null);
		}
		else {
			map.put("sources", String.valueOf(sourcesResponse.getSources()));
		}

		return map;
	}

	public static class SourcesResponseJSONParser
		extends BaseJSONParser<SourcesResponse> {

		@Override
		protected SourcesResponse createDTO() {
			return new SourcesResponse();
		}

		@Override
		protected SourcesResponse[] createDTOArray(int size) {
			return new SourcesResponse[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "sources")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			SourcesResponse sourcesResponse, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "sources")) {
				if (jsonParserFieldValue != null) {
					sourcesResponse.setSources(
						toStrings((Object[])jsonParserFieldValue));
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