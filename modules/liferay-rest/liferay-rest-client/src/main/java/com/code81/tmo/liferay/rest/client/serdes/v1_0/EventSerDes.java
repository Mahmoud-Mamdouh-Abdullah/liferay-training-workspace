package com.code81.tmo.liferay.rest.client.serdes.v1_0;

import com.code81.tmo.liferay.rest.client.dto.v1_0.Event;
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
public class EventSerDes {

	public static Event toDTO(String json) {
		EventJSONParser eventJSONParser = new EventJSONParser();

		return eventJSONParser.parseToDTO(json);
	}

	public static Event[] toDTOs(String json) {
		EventJSONParser eventJSONParser = new EventJSONParser();

		return eventJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Event event) {
		if (event == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (event.getDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"date\": ");

			sb.append("\"");

			sb.append(_escape(event.getDate()));

			sb.append("\"");
		}

		if (event.getDescription() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"description\": ");

			sb.append("\"");

			sb.append(_escape(event.getDescription()));

			sb.append("\"");
		}

		if (event.getImageUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"imageUrl\": ");

			sb.append("\"");

			sb.append(_escape(event.getImageUrl()));

			sb.append("\"");
		}

		if (event.getLink() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"link\": ");

			sb.append("\"");

			sb.append(_escape(event.getLink()));

			sb.append("\"");
		}

		if (event.getLocation() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"location\": ");

			sb.append("\"");

			sb.append(_escape(event.getLocation()));

			sb.append("\"");
		}

		if (event.getTimeFrom() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"timeFrom\": ");

			sb.append("\"");

			sb.append(_escape(event.getTimeFrom()));

			sb.append("\"");
		}

		if (event.getTimeTo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"timeTo\": ");

			sb.append("\"");

			sb.append(_escape(event.getTimeTo()));

			sb.append("\"");
		}

		if (event.getTitle() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"title\": ");

			sb.append("\"");

			sb.append(_escape(event.getTitle()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EventJSONParser eventJSONParser = new EventJSONParser();

		return eventJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Event event) {
		if (event == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (event.getDate() == null) {
			map.put("date", null);
		}
		else {
			map.put("date", String.valueOf(event.getDate()));
		}

		if (event.getDescription() == null) {
			map.put("description", null);
		}
		else {
			map.put("description", String.valueOf(event.getDescription()));
		}

		if (event.getImageUrl() == null) {
			map.put("imageUrl", null);
		}
		else {
			map.put("imageUrl", String.valueOf(event.getImageUrl()));
		}

		if (event.getLink() == null) {
			map.put("link", null);
		}
		else {
			map.put("link", String.valueOf(event.getLink()));
		}

		if (event.getLocation() == null) {
			map.put("location", null);
		}
		else {
			map.put("location", String.valueOf(event.getLocation()));
		}

		if (event.getTimeFrom() == null) {
			map.put("timeFrom", null);
		}
		else {
			map.put("timeFrom", String.valueOf(event.getTimeFrom()));
		}

		if (event.getTimeTo() == null) {
			map.put("timeTo", null);
		}
		else {
			map.put("timeTo", String.valueOf(event.getTimeTo()));
		}

		if (event.getTitle() == null) {
			map.put("title", null);
		}
		else {
			map.put("title", String.valueOf(event.getTitle()));
		}

		return map;
	}

	public static class EventJSONParser extends BaseJSONParser<Event> {

		@Override
		protected Event createDTO() {
			return new Event();
		}

		@Override
		protected Event[] createDTOArray(int size) {
			return new Event[size];
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
			else if (Objects.equals(jsonParserFieldName, "link")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "location")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "timeFrom")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "timeTo")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			Event event, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "date")) {
				if (jsonParserFieldValue != null) {
					event.setDate((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					event.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "imageUrl")) {
				if (jsonParserFieldValue != null) {
					event.setImageUrl((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "link")) {
				if (jsonParserFieldValue != null) {
					event.setLink((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "location")) {
				if (jsonParserFieldValue != null) {
					event.setLocation((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "timeFrom")) {
				if (jsonParserFieldValue != null) {
					event.setTimeFrom((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "timeTo")) {
				if (jsonParserFieldValue != null) {
					event.setTimeTo((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					event.setTitle((String)jsonParserFieldValue);
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