package com.code81.tmo.liferay.rest.client.serdes.v1_0;

import com.code81.tmo.liferay.rest.client.dto.v1_0.Event;
import com.code81.tmo.liferay.rest.client.dto.v1_0.EventsResponse;
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
public class EventsResponseSerDes {

	public static EventsResponse toDTO(String json) {
		EventsResponseJSONParser eventsResponseJSONParser =
			new EventsResponseJSONParser();

		return eventsResponseJSONParser.parseToDTO(json);
	}

	public static EventsResponse[] toDTOs(String json) {
		EventsResponseJSONParser eventsResponseJSONParser =
			new EventsResponseJSONParser();

		return eventsResponseJSONParser.parseToDTOs(json);
	}

	public static String toJSON(EventsResponse eventsResponse) {
		if (eventsResponse == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (eventsResponse.getEvents() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"events\": ");

			sb.append("[");

			for (int i = 0; i < eventsResponse.getEvents().length; i++) {
				sb.append(String.valueOf(eventsResponse.getEvents()[i]));

				if ((i + 1) < eventsResponse.getEvents().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (eventsResponse.getPage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"page\": ");

			sb.append(eventsResponse.getPage());
		}

		if (eventsResponse.getSize() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"size\": ");

			sb.append(eventsResponse.getSize());
		}

		if (eventsResponse.getTotalCount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalCount\": ");

			sb.append(eventsResponse.getTotalCount());
		}

		if (eventsResponse.getTotalPages() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"totalPages\": ");

			sb.append(eventsResponse.getTotalPages());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EventsResponseJSONParser eventsResponseJSONParser =
			new EventsResponseJSONParser();

		return eventsResponseJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(EventsResponse eventsResponse) {
		if (eventsResponse == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (eventsResponse.getEvents() == null) {
			map.put("events", null);
		}
		else {
			map.put("events", String.valueOf(eventsResponse.getEvents()));
		}

		if (eventsResponse.getPage() == null) {
			map.put("page", null);
		}
		else {
			map.put("page", String.valueOf(eventsResponse.getPage()));
		}

		if (eventsResponse.getSize() == null) {
			map.put("size", null);
		}
		else {
			map.put("size", String.valueOf(eventsResponse.getSize()));
		}

		if (eventsResponse.getTotalCount() == null) {
			map.put("totalCount", null);
		}
		else {
			map.put(
				"totalCount", String.valueOf(eventsResponse.getTotalCount()));
		}

		if (eventsResponse.getTotalPages() == null) {
			map.put("totalPages", null);
		}
		else {
			map.put(
				"totalPages", String.valueOf(eventsResponse.getTotalPages()));
		}

		return map;
	}

	public static class EventsResponseJSONParser
		extends BaseJSONParser<EventsResponse> {

		@Override
		protected EventsResponse createDTO() {
			return new EventsResponse();
		}

		@Override
		protected EventsResponse[] createDTOArray(int size) {
			return new EventsResponse[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "events")) {
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
			EventsResponse eventsResponse, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "events")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					Event[] eventsArray =
						new Event[jsonParserFieldValues.length];

					for (int i = 0; i < eventsArray.length; i++) {
						eventsArray[i] = EventSerDes.toDTO(
							(String)jsonParserFieldValues[i]);
					}

					eventsResponse.setEvents(eventsArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					eventsResponse.setPage(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "size")) {
				if (jsonParserFieldValue != null) {
					eventsResponse.setSize(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					eventsResponse.setTotalCount(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalPages")) {
				if (jsonParserFieldValue != null) {
					eventsResponse.setTotalPages(
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