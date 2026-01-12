package com.code81.tmo.liferay.rest.client.serdes.v1_0;

import com.code81.tmo.liferay.rest.client.dto.v1_0.News;
import com.code81.tmo.liferay.rest.client.dto.v1_0.NewsResponse;
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
public class NewsResponseSerDes {

	public static NewsResponse toDTO(String json) {
		NewsResponseJSONParser newsResponseJSONParser =
			new NewsResponseJSONParser();

		return newsResponseJSONParser.parseToDTO(json);
	}

	public static NewsResponse[] toDTOs(String json) {
		NewsResponseJSONParser newsResponseJSONParser =
			new NewsResponseJSONParser();

		return newsResponseJSONParser.parseToDTOs(json);
	}

	public static String toJSON(NewsResponse newsResponse) {
		if (newsResponse == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (newsResponse.getNewses() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"newses\": ");

			sb.append("[");

			for (int i = 0; i < newsResponse.getNewses().length; i++) {
				sb.append(String.valueOf(newsResponse.getNewses()[i]));

				if ((i + 1) < newsResponse.getNewses().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (newsResponse.getPage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"page\": ");

			sb.append(newsResponse.getPage());
		}

		if (newsResponse.getSize() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"size\": ");

			sb.append(newsResponse.getSize());
		}

		if (newsResponse.getTotalCount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalCount\": ");

			sb.append(newsResponse.getTotalCount());
		}

		if (newsResponse.getTotalPages() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalPages\": ");

			sb.append(newsResponse.getTotalPages());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		NewsResponseJSONParser newsResponseJSONParser =
			new NewsResponseJSONParser();

		return newsResponseJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(NewsResponse newsResponse) {
		if (newsResponse == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (newsResponse.getNewses() == null) {
			map.put("newses", null);
		}
		else {
			map.put("newses", String.valueOf(newsResponse.getNewses()));
		}

		if (newsResponse.getPage() == null) {
			map.put("page", null);
		}
		else {
			map.put("page", String.valueOf(newsResponse.getPage()));
		}

		if (newsResponse.getSize() == null) {
			map.put("size", null);
		}
		else {
			map.put("size", String.valueOf(newsResponse.getSize()));
		}

		if (newsResponse.getTotalCount() == null) {
			map.put("totalCount", null);
		}
		else {
			map.put("totalCount", String.valueOf(newsResponse.getTotalCount()));
		}

		if (newsResponse.getTotalPages() == null) {
			map.put("totalPages", null);
		}
		else {
			map.put("totalPages", String.valueOf(newsResponse.getTotalPages()));
		}

		return map;
	}

	public static class NewsResponseJSONParser
		extends BaseJSONParser<NewsResponse> {

		@Override
		protected NewsResponse createDTO() {
			return new NewsResponse();
		}

		@Override
		protected NewsResponse[] createDTOArray(int size) {
			return new NewsResponse[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "newses")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
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
			NewsResponse newsResponse, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "newses")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					News[] newsesArray = new News[jsonParserFieldValues.length];

					for (int i = 0; i < newsesArray.length; i++) {
						newsesArray[i] = NewsSerDes.toDTO(
							(String)jsonParserFieldValues[i]);
					}

					newsResponse.setNewses(newsesArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					newsResponse.setPage(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "size")) {
				if (jsonParserFieldValue != null) {
					newsResponse.setSize(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					newsResponse.setTotalCount(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalPages")) {
				if (jsonParserFieldValue != null) {
					newsResponse.setTotalPages(
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