package com.code81.tmo.liferay.rest.client.serdes.v1_0;

import com.code81.tmo.liferay.rest.client.dto.v1_0.News;
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
public class NewsSerDes {

	public static News toDTO(String json) {
		NewsJSONParser newsJSONParser = new NewsJSONParser();

		return newsJSONParser.parseToDTO(json);
	}

	public static News[] toDTOs(String json) {
		NewsJSONParser newsJSONParser = new NewsJSONParser();

		return newsJSONParser.parseToDTOs(json);
	}

	public static String toJSON(News news) {
		if (news == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (news.getDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"date\": ");

			sb.append("\"");

			sb.append(_escape(news.getDate()));

			sb.append("\"");
		}

		if (news.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(news.getDescription()));

			sb.append("\"");
		}

		if (news.getImageUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imageUrl\": ");

			sb.append("\"");

			sb.append(_escape(news.getImageUrl()));

			sb.append("\"");
		}

		if (news.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(news.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		NewsJSONParser newsJSONParser = new NewsJSONParser();

		return newsJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(News news) {
		if (news == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (news.getDate() == null) {
			map.put("date", null);
		}
		else {
			map.put("date", String.valueOf(news.getDate()));
		}

		if (news.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(news.getDescription()));
		}

		if (news.getImageUrl() == null) {
			map.put("imageUrl", null);
		}
		else {
			map.put("imageUrl", String.valueOf(news.getImageUrl()));
		}

		if (news.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(news.getTitle()));
		}

		return map;
	}

	public static class NewsJSONParser extends BaseJSONParser<News> {

		@Override
		protected News createDTO() {
			return new News();
		}

		@Override
		protected News[] createDTOArray(int size) {
			return new News[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "date")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "imageUrl")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			News news, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "date")) {
				if (jsonParserFieldValue != null) {
					news.setDate((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					news.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "imageUrl")) {
				if (jsonParserFieldValue != null) {
					news.setImageUrl((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					news.setTitle((String)jsonParserFieldValue);
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